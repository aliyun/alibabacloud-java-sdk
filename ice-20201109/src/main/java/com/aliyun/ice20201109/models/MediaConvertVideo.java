// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertVideo extends TeaModel {
    /**
     * <p>The average bitrate of the output. If you use the CRB, ABR, or VBR bitrate control mode, you must specify Bitrate, and you must set TransMode to a valid value.</p>
     * <ul>
     * <li>Unit: Kbps.</li>
     * <li>Valid values: -1 and [10,50000]. A value of -1 indicates that the original bitrate of the input is used.</li>
     * </ul>
     * <p>Best practices:</p>
     * <ul>
     * <li>CBR: Set TransMode to CBR and Bitrate, Maxrate, and Bufsize to the same value.</li>
     * <li>ABR: Set TransMode to onepass and specify Bitrate. You can also specify Maxrate and Bufsize to control the bitrate range.</li>
     * <li>VBR: Set TransMode to twopass and specify Maxrate/BitrateBnd and Bufsize.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6000</p>
     */
    @NameInMap("Bitrate")
    public Integer bitrate;

    /**
     * <p>The buffer size. It controls bitrate fluctuations. A larger value allows for more bitrate variation and potentially higher video quality.</p>
     * <ul>
     * <li>Unit: Kbps.</li>
     * <li>Valid values: [1000,128000].</li>
     * <li>Default value: 6000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("Bufsize")
    public Integer bufsize;

    /**
     * <p>The video codec.</p>
     * <ul>
     * <li>Valid values: H.264, H.265, AV1, GIF, and WEBP.</li>
     * <li>Default value: H.264.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>H.264</p>
     */
    @NameInMap("Codec")
    public String codec;

    /**
     * <p>The quality control factor. To use the CRF mode, you must specify Crf and set TransMode to fixCRF. A larger value means lower quality and a higher compression ratio.</p>
     * <ul>
     * <li>Valid values: [20,51].</li>
     * <li>If Codec is set to H.264, the default value is 23. If Codec is set to H.265, the default value is 26. If Codec is set to AV1, the default value is 32.</li>
     * </ul>
     * <p>Best Practice:</p>
     * <ul>
     * <li>A value of 0 specifies lossless quality. A value of 51 specifies the worst quality. A recommended range is [23, 29]. You can adjust the value based on the complexity of the image. If you increase the value by six, the bitrate is reduced by half. Under the same definition, you can set the value for an animated cartoon higher than that for a shot video.</li>
     * <li>CRF targets perceptual quality, not a fixed bitrate. Use it with Maxrate and Bufsize to control bitrate fluctuations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("Crf")
    public Object crf;

    /**
     * <p>Crops the video frame. You can set automatic black border removal or custom cropping.</p>
     * <ul>
     * <li><p>Specify this parameter if the input resolution is greater than the output resolution. Do not specify AdjDarMethod if this parameter is specified.</p>
     * </li>
     * <li><p>To automatically remove black borders, set this parameter to border.</p>
     * </li>
     * <li><p>To use custom cropping, set the parameter in the format of {width}:{height}:{left}:{top}.</p>
     * <ul>
     * <li>width: the width of the output video.</li>
     * <li>height: the height of the output video.</li>
     * <li>left: the distance between the left border of the output and that of the original frame.</li>
     * <li>top: the distance between the top border of the output and that of the original frame.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Example: 1920:800:0:140.</p>
     * 
     * <strong>example:</strong>
     * <p>1920:800:0:140</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The frame rate of the video stream.</p>
     * <ul>
     * <li>Unit: frames per second (FPS).</li>
     * <li>Valid values: (0,60].</li>
     * <li>Default value: the frame rate of the input file. If the original frame rate exceeds 60 FPS, 60 is used.</li>
     * <li>Recommended values: 24, 25, and 30.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("Fps")
    public Object fps;

    /**
     * <p>The keyframe interval.</p>
     * <ul>
     * <li>Set by time: The time interval, in seconds. Valid values: [1,100000].</li>
     * <li>Set by frame count: The number of frames. Valid values: [1,100000].</li>
     * <li>Default value: 10s.</li>
     * </ul>
     * <p>Best practice: Set this parameter to 2-7s to improve the Time-to-First-Frame and seeking performance.</p>
     * 
     * <strong>example:</strong>
     * <p>10s</p>
     */
    @NameInMap("Gop")
    public Object gop;

    /**
     * <p>The height or short edge of the output. If LongShortMode is set to false or left empty, this parameter specifies the height of the output. If LongShortMode is set to true, this parameter specifies the short edge of the output.</p>
     * <ul>
     * <li><p>Unit: pixel.</p>
     * </li>
     * <li><p>Valid values: [128,4096]. The value must be an even number.</p>
     * </li>
     * <li><p>Default value:</p>
     * <ul>
     * <li>If neither Width nor Height is specified, the dimension of the input is used.</li>
     * <li>If only Width is specified, Height is auto-scaled.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Specifies whether to enable orientation-adaptive scaling. This parameter takes effect if at least one of the Width and Height parameters is specified. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * <li>Default value: false.</li>
     * </ul>
     * <p>Best practice: Enable this feature when your inputs include both horizontal and vertical videos. This prevents videos from stretching.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongShortMode")
    public Boolean longShortMode;

    /**
     * <p>The maximum frame rate.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("MaxFps")
    public Object maxFps;

    /**
     * <p>The maximum bitrate of the output.</p>
     * <ul>
     * <li>Unit: Kbps.</li>
     * <li>Valid values: [10,50000].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Maxrate")
    public Integer maxrate;

    /**
     * <p>The black borders added to the video.</p>
     * <ul>
     * <li><p>Specify this parameter if the input resolution is smaller than the output resolution. If you specify this parameter, do not specify IsCheckReso, IsCheckResoFail, or AdjDarMethod.</p>
     * </li>
     * <li><p>Format: {width}:{height}:{left}:{top}.</p>
     * <ul>
     * <li>width: the width of the output video.</li>
     * <li>height: the height of the output video.</li>
     * <li>left: the distance between the left border of the output and that of the original frame.</li>
     * <li>top: the distance between the top border of the output and that of the original frame.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Example: 1920:1080:0:140.</p>
     * 
     * <strong>example:</strong>
     * <p>1920:1080:0:140</p>
     */
    @NameInMap("Pad")
    public String pad;

    /**
     * <p>The codec profile.</p>
     * <ul>
     * <li>This parameter takes effect only if Codec is set to H.264.</li>
     * <li>Valid values: baseline, main, and high.</li>
     * <li>Default value: high.</li>
     * </ul>
     * <p>Best practice: For multi-bitrate streaming, use baseline for the lowest quality rendition to ensure maximum compatibility with older devices. Use main or high for other renditions.</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The video quality scale. This parameter applies to VBR mode. A higher value means lower video quality and a higher compression ratio.</p>
     * <ul>
     * <li>This parameter takes effect only if Codec is set to H.264.</li>
     * <li>Valid values: [0,51].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("Qscale")
    public Integer qscale;

    /**
     * <p>Specifies whether to delete the video stream. Valid values:</p>
     * <ul>
     * <li>true: deletes the video stream. All video-related parameters are invalid.</li>
     * <li>false: retains the video stream.</li>
     * <li>Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Remove")
    public Boolean remove;

    /**
     * <p>The scan mode. Valid values:</p>
     * <ul>
     * <li>If you leave this parameter empty, the output follows the source\&quot;s original scan mode.</li>
     * <li>auto: automatic deinterlacing</li>
     * <li>progressive</li>
     * <li>interlaced</li>
     * <li>By default, this parameter is left empty.</li>
     * </ul>
     * <p>Best practice: The interlaced scan mode saves data traffic than the progressive scan mode but provides poor image quality. Therefore, the latter is commonly used in mainstream video production.</p>
     * <ul>
     * <li>If you set ScanMode to progressive or interlaced, but this scan mode does not match that of the input, the video fails to be transcoded.</li>
     * <li>To improve compatibility, leave this parameter empty or set it to auto.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("ScanMode")
    public String scanMode;

    /**
     * <p>The width or long edge of the output. If LongShortMode is set to false or left empty, this parameter specifies the width of the output. If LongShortMode is set to true, this parameter specifies the long edge of the output.</p>
     * <ul>
     * <li><p>Unit: pixel.</p>
     * </li>
     * <li><p>Valid values: [128,4096]. The value must be an even number.</p>
     * </li>
     * <li><p>Default value:</p>
     * <ul>
     * <li>If neither Width nor Height is specified, the dimension of the input is used.</li>
     * <li>If only Height is specified, Width is auto-scaled.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static MediaConvertVideo build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertVideo self = new MediaConvertVideo();
        return TeaModel.build(map, self);
    }

    public MediaConvertVideo setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public MediaConvertVideo setBufsize(Integer bufsize) {
        this.bufsize = bufsize;
        return this;
    }
    public Integer getBufsize() {
        return this.bufsize;
    }

    public MediaConvertVideo setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public MediaConvertVideo setCrf(Object crf) {
        this.crf = crf;
        return this;
    }
    public Object getCrf() {
        return this.crf;
    }

    public MediaConvertVideo setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public MediaConvertVideo setFps(Object fps) {
        this.fps = fps;
        return this;
    }
    public Object getFps() {
        return this.fps;
    }

    public MediaConvertVideo setGop(Object gop) {
        this.gop = gop;
        return this;
    }
    public Object getGop() {
        return this.gop;
    }

    public MediaConvertVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public MediaConvertVideo setLongShortMode(Boolean longShortMode) {
        this.longShortMode = longShortMode;
        return this;
    }
    public Boolean getLongShortMode() {
        return this.longShortMode;
    }

    public MediaConvertVideo setMaxFps(Object maxFps) {
        this.maxFps = maxFps;
        return this;
    }
    public Object getMaxFps() {
        return this.maxFps;
    }

    public MediaConvertVideo setMaxrate(Integer maxrate) {
        this.maxrate = maxrate;
        return this;
    }
    public Integer getMaxrate() {
        return this.maxrate;
    }

    public MediaConvertVideo setPad(String pad) {
        this.pad = pad;
        return this;
    }
    public String getPad() {
        return this.pad;
    }

    public MediaConvertVideo setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public MediaConvertVideo setQscale(Integer qscale) {
        this.qscale = qscale;
        return this;
    }
    public Integer getQscale() {
        return this.qscale;
    }

    public MediaConvertVideo setRemove(Boolean remove) {
        this.remove = remove;
        return this;
    }
    public Boolean getRemove() {
        return this.remove;
    }

    public MediaConvertVideo setScanMode(String scanMode) {
        this.scanMode = scanMode;
        return this;
    }
    public String getScanMode() {
        return this.scanMode;
    }

    public MediaConvertVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
