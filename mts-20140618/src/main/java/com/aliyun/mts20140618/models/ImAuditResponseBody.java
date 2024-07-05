// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the image moderation QPS exceeds the limit. Valid values: true and false. A value of true indicates that the QPS does not exceed the limit. A value of false indicates that the QPS exceeds the limit.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ImageQuotaExceed")
    public Boolean imageQuotaExceed;

    /**
     * <p>The image moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/268644.html">Data returned by the ImAudit operation</a>.</p>
     */
    @NameInMap("ImageResults")
    public ImAuditResponseBodyImageResults imageResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5210DBB0-E327-4D45-ADBC-0B83C8793421</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the text moderation QPS exceeds the limit. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TextQuotaExceed")
    public Boolean textQuotaExceed;

    /**
     * <p>The text moderation results. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/268644.html">Data returned by the ImAudit operation</a>.</p>
     */
    @NameInMap("TextResults")
    public ImAuditResponseBodyTextResults textResults;

    public static ImAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImAuditResponseBody self = new ImAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ImAuditResponseBody setImageQuotaExceed(Boolean imageQuotaExceed) {
        this.imageQuotaExceed = imageQuotaExceed;
        return this;
    }
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    public ImAuditResponseBody setImageResults(ImAuditResponseBodyImageResults imageResults) {
        this.imageResults = imageResults;
        return this;
    }
    public ImAuditResponseBodyImageResults getImageResults() {
        return this.imageResults;
    }

    public ImAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImAuditResponseBody setTextQuotaExceed(Boolean textQuotaExceed) {
        this.textQuotaExceed = textQuotaExceed;
        return this;
    }
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    public ImAuditResponseBody setTextResults(ImAuditResponseBodyTextResults textResults) {
        this.textResults = textResults;
        return this;
    }
    public ImAuditResponseBodyTextResults getTextResults() {
        return this.textResults;
    }

    public static class ImAuditResponseBodyImageResultsResultResultsFrames extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. A higher confidence level indicates higher reliability of the moderation result. We recommend that you do not use this score in your business.</p>
         * 
         * <strong>example:</strong>
         * <p>89.85</p>
         */
        @NameInMap("rate")
        public Float rate;

        /**
         * <p>The temporary access URL of the truncated frame. The URL is valid for 5 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/test-01.jpg">http://example.com/test-01.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ImAuditResponseBodyImageResultsResultResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsFrames self = new ImAuditResponseBodyImageResultsResultResultsFrames();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyImageResultsResultResultsFrames setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsHintWordsInfo extends TeaModel {
        /**
         * <p>The term hit by the detected text.</p>
         * 
         * <strong>example:</strong>
         * <p>Sensitive words</p>
         */
        @NameInMap("context")
        public String context;

        public static ImAuditResponseBodyImageResultsResultResultsHintWordsInfo build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsHintWordsInfo self = new ImAuditResponseBodyImageResultsResultResultsHintWordsInfo();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsHintWordsInfo setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsLogoData extends TeaModel {
        /**
         * <p>The height of the logo area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>106</p>
         */
        @NameInMap("h")
        public Float h;

        /**
         * <p>The name of the detected logo.</p>
         * 
         * <strong>example:</strong>
         * <p>Hunan TV</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the detected logo. For example, a value of TV indicates a controlled media logo.</p>
         * 
         * <strong>example:</strong>
         * <p>TV</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The width of the logo area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>106</p>
         */
        @NameInMap("w")
        public Float w;

        /**
         * <p>The distance between the upper-left corner of the logo area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>140</p>
         */
        @NameInMap("x")
        public Float x;

        /**
         * <p>The distance between the upper-left corner of the logo area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsLogoData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsLogoData self = new ImAuditResponseBodyImageResultsResultResultsLogoData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsProgramCodeData extends TeaModel {
        /**
         * <p>The height of the mini program code area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>413.0</p>
         */
        @NameInMap("h")
        public Float h;

        /**
         * <p>The width of the mini program code area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>402.0</p>
         */
        @NameInMap("w")
        public Float w;

        /**
         * <p>The distance between the upper-left corner of the mini program code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0</p>
         */
        @NameInMap("x")
        public Float x;

        /**
         * <p>The distance between the upper-left corner of the mini program code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsProgramCodeData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsProgramCodeData self = new ImAuditResponseBodyImageResultsResultResultsProgramCodeData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsQrcodeLocations extends TeaModel {
        /**
         * <p>The height of the QR code area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>413.0</p>
         */
        @NameInMap("h")
        public Float h;

        /**
         * <p>The URL that the detected QR code points to.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("qrcode")
        public String qrcode;

        /**
         * <p>The width of the QR code area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>402.0</p>
         */
        @NameInMap("w")
        public Float w;

        /**
         * <p>The distance between the upper-left corner of the QR code area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("x")
        public Float x;

        /**
         * <p>The distance between the upper-left corner of the QR code area and the x-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsQrcodeLocations build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsQrcodeLocations self = new ImAuditResponseBodyImageResultsResultResultsQrcodeLocations();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces extends TeaModel {
        /**
         * <p>The ID of the detected face. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>AliFace_0001234</p>
         */
        @NameInMap("idid")
        public String idid;

        /**
         * <p>This value is a string, which indicates the name of a similar person.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The score of the confidence level. The value is a float point number. Valid values: 0 to 100. A greater value indicates a higher confidence level for facial recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>91.54</p>
         */
        @NameInMap("re")
        public Float re;

        public static ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces self = new ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setIdid(String idid) {
            this.idid = idid;
            return this;
        }
        public String getIdid() {
            return this.idid;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setRe(Float re) {
            this.re = re;
            return this;
        }
        public Float getRe() {
            return this.re;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsSfaceData extends TeaModel {
        /**
         * <p>The information about the face detected in the moderated image.</p>
         */
        @NameInMap("faces")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> faces;

        /**
         * <p>The height of the face area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("h")
        public Float h;

        /**
         * <p>The width of the face area. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("w")
        public Float w;

        /**
         * <p>The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("x")
        public Float x;

        /**
         * <p>The distance between the upper-left corner of the face area and the y-axis, with the upper-left corner of the image being the coordinate origin. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsSfaceData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsSfaceData self = new ImAuditResponseBodyImageResultsResultResultsSfaceData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setFaces(java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> getFaces() {
            return this.faces;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResults extends TeaModel {
        /**
         * <p>The category of the moderation results. Valid values vary based on the specified moderation scenario.</p>
         * <ul>
         * <li><p>If the Scenes parameter is set to porn, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>sexy: sexy content</li>
         * <li>porn: pornographic content</li>
         * </ul>
         * </li>
         * <li><p>If the Scenes parameter is set to terrorism, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>bloody: bloody content</li>
         * <li>explosion: explosions and smoke</li>
         * <li>outfit: special costume</li>
         * <li>logo: special logo</li>
         * <li>weapon: weapon</li>
         * <li>politics: political content</li>
         * <li>violence: violence</li>
         * <li>crowd: crowd</li>
         * <li>parade: parade</li>
         * <li>carcrash: car accident</li>
         * <li>flag: flag</li>
         * <li>location: landmark</li>
         * <li>others: other content</li>
         * </ul>
         * </li>
         * <li><p>If the Scenes parameter is set to ad, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>ad: ad violation</li>
         * <li>politics: politically sensitive content in text</li>
         * <li>porn: pornographic content in text</li>
         * <li>abuse: abuse in text</li>
         * <li>terrorism: terrorist content in text</li>
         * <li>contraband: prohibited content in text</li>
         * <li>spam: junk content in text</li>
         * <li>npx: illegal ad</li>
         * <li>qrcode: QR code</li>
         * <li>programCode: mini program code</li>
         * </ul>
         * </li>
         * <li><p>If the Scenes parameter is set to qrcode, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>qrcode: QR code</li>
         * <li>programCode: mini program code</li>
         * </ul>
         * </li>
         * <li><p>If the Scenes parameter is set to live, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>meaningless: no content in the image, such as black or white screen</li>
         * <li>PIP: picture-in-picture</li>
         * <li>smoking: smoking</li>
         * <li>drivelive: live broadcasting in a running vehicle</li>
         * </ul>
         * </li>
         * <li><p>If the Scenes parameter is set to logo, the valid values are:</p>
         * <ul>
         * <li>normal: no pornographic content</li>
         * <li>TV: controlled logo</li>
         * <li>trademark: trademark</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sexy</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.</p>
         * <blockquote>
         * <p> This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>91.54</p>
         */
        @NameInMap("Rate")
        public Double rate;

        /**
         * <p>The image moderation scenario. Valid values:</p>
         * <ul>
         * <li>porn: pornography</li>
         * <li>terrorism: terrorist content</li>
         * <li>ad: ad violation</li>
         * <li>qrcode: QR code</li>
         * <li>live: undesirable scene</li>
         * <li>logo: special logo</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li>pass: The content passes the moderation. No further actions are required.</li>
         * <li>review: The moderation object contains suspected violations and requires human review.</li>
         * <li>block: The moderation object contains violations. We recommend that you delete or block the object.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>If the temporary access URL of the image is too long, a truncated temporary access URL is returned for each frame.</p>
         */
        @NameInMap("frames")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> frames;

        /**
         * <p>The information about the term hit by the ad or violation text detected in the moderated image.</p>
         */
        @NameInMap("hintWordsInfo")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> hintWordsInfo;

        /**
         * <p>The information about the logo detected in the moderated image.</p>
         */
        @NameInMap("logoData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> logoData;

        /**
         * <p>ocrData</p>
         */
        @NameInMap("ocrData")
        public java.util.List<String> ocrData;

        /**
         * <p>The location information of the mini program code detected in the moderated image.</p>
         */
        @NameInMap("programCodeData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> programCodeData;

        /**
         * <p>The information about the text that is included in the QR code detected in the moderated image.</p>
         */
        @NameInMap("qrcodeData")
        public java.util.List<String> qrcodeData;

        /**
         * <p>The coordinates of the QR code detected in the image.</p>
         */
        @NameInMap("qrcodeLocations")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> qrcodeLocations;

        /**
         * <p>The information about the terrorist content detected in the moderated image.</p>
         */
        @NameInMap("sfaceData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> sfaceData;

        public static ImAuditResponseBodyImageResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResults self = new ImAuditResponseBodyImageResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyImageResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyImageResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyImageResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ImAuditResponseBodyImageResultsResultResults setFrames(java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> getFrames() {
            return this.frames;
        }

        public ImAuditResponseBodyImageResultsResultResults setHintWordsInfo(java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> hintWordsInfo) {
            this.hintWordsInfo = hintWordsInfo;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> getHintWordsInfo() {
            return this.hintWordsInfo;
        }

        public ImAuditResponseBodyImageResultsResultResults setLogoData(java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> logoData) {
            this.logoData = logoData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> getLogoData() {
            return this.logoData;
        }

        public ImAuditResponseBodyImageResultsResultResults setOcrData(java.util.List<String> ocrData) {
            this.ocrData = ocrData;
            return this;
        }
        public java.util.List<String> getOcrData() {
            return this.ocrData;
        }

        public ImAuditResponseBodyImageResultsResultResults setProgramCodeData(java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> programCodeData) {
            this.programCodeData = programCodeData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> getProgramCodeData() {
            return this.programCodeData;
        }

        public ImAuditResponseBodyImageResultsResultResults setQrcodeData(java.util.List<String> qrcodeData) {
            this.qrcodeData = qrcodeData;
            return this;
        }
        public java.util.List<String> getQrcodeData() {
            return this.qrcodeData;
        }

        public ImAuditResponseBodyImageResultsResultResults setQrcodeLocations(java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> qrcodeLocations) {
            this.qrcodeLocations = qrcodeLocations;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> getQrcodeLocations() {
            return this.qrcodeLocations;
        }

        public ImAuditResponseBodyImageResultsResultResults setSfaceData(java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> sfaceData) {
            this.sfaceData = sfaceData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> getSfaceData() {
            return this.sfaceData;
        }

    }

    public static class ImAuditResponseBodyImageResultsResult extends TeaModel {
        /**
         * <p>The error code. The error code is the same as the HTTP status code. This parameter is not returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The ID of the moderated object.</p>
         * <blockquote>
         * <p> If you set the dataId parameter in the moderation request, the dataId parameter is returned in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>uuid-1234-1234-1234</p>
         */
        @NameInMap("dataId")
        public String dataId;

        /**
         * <p>The additional information about the image. If ad is specified for the Scenes parameter, the following content may be returned for this parameter: hitLibInfo: the information about the custom text library that is hit by the text in the image. The value of this parameter is an array. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/268644.html">hitLibInfo</a>.</p>
         */
        @NameInMap("extras")
        public java.util.Map<String, ?> extras;

        /**
         * <p>The message that is returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>The returned data. If the call is successful, the array in the returned results contains one or more elements. Each element is a struct.</p>
         */
        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> results;

        /**
         * <p>The ID of the moderation task.</p>
         * 
         * <strong>example:</strong>
         * <p>img4wlJcb7p4wH4lAP3111111-12****</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The URL of the moderated object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/example-****.jpg">http://example.com/example-****.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ImAuditResponseBodyImageResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResult self = new ImAuditResponseBodyImageResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyImageResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyImageResultsResult setExtras(java.util.Map<String, ?> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.Map<String, ?> getExtras() {
            return this.extras;
        }

        public ImAuditResponseBodyImageResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyImageResultsResult setResults(java.util.List<ImAuditResponseBodyImageResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyImageResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImAuditResponseBodyImageResultsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ImAuditResponseBodyImageResults extends TeaModel {
        /**
         * <p>The image moderation results.</p>
         */
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyImageResultsResult> result;

        public static ImAuditResponseBodyImageResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResults self = new ImAuditResponseBodyImageResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResults setResult(java.util.List<ImAuditResponseBodyImageResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResult> getResult() {
            return this.result;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResultsDetailsContexts extends TeaModel {
        /**
         * <p>The term that the moderated text hits. If the text hits a term, the term is returned. If the text hits the algorithmic model, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Door-to-door service</p>
         */
        @NameInMap("context")
        public String context;

        /**
         * <p>The code of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("libCode")
        public String libCode;

        /**
         * <p>The name of the custom text library. This parameter is returned if the moderated text hits a term in the custom text library.</p>
         * 
         * <strong>example:</strong>
         * <p>Name of your custom text library</p>
         */
        @NameInMap("libName")
        public String libName;

        /**
         * <p>The position of the term that the moderated text hits in the original text.</p>
         */
        @NameInMap("positions")
        public java.util.List<String> positions;

        /**
         * <p>The behavior rule. This parameter is returned if the moderated text hits the behavior rule. Valid values:</p>
         * <ul>
         * <li>user_id</li>
         * <li>ip</li>
         * <li>umid</li>
         * <li>content</li>
         * <li>similar_content</li>
         * <li>imei</li>
         * <li>imsi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("ruleType")
        public String ruleType;

        public static ImAuditResponseBodyTextResultsResultResultsDetailsContexts build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResultsDetailsContexts self = new ImAuditResponseBodyTextResultsResultResultsDetailsContexts();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setLibCode(String libCode) {
            this.libCode = libCode;
            return this;
        }
        public String getLibCode() {
            return this.libCode;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setPositions(java.util.List<String> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<String> getPositions() {
            return this.positions;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResultsDetails extends TeaModel {
        /**
         * <p>The category of the risky content that the moderated text hits. Valid values:</p>
         * <ul>
         * <li>spam: spam</li>
         * <li>ad: ad</li>
         * <li>politics: political content</li>
         * <li>terrorism: terrorist content</li>
         * <li>abuse: abuse</li>
         * <li>porn: pornographic content</li>
         * <li>flood: excessive junk content</li>
         * <li>contraband: prohibited content</li>
         * <li>meaningless: meaningless content</li>
         * <li>customized: custom content, such as a custom keyword</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The context information of the risky content that the moderated text hits.</p>
         */
        @NameInMap("contexts")
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> contexts;

        public static ImAuditResponseBodyTextResultsResultResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResultsDetails self = new ImAuditResponseBodyTextResultsResultResultsDetails();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetails setContexts(java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> getContexts() {
            return this.contexts;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResults extends TeaModel {
        /**
         * <p>The risky content that the moderated text hits. A text entry can hit multiple pieces of risky content.</p>
         */
        @NameInMap("details")
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details;

        /**
         * <p>The category of the moderation result for the moderated text. Valid values:</p>
         * <ul>
         * <li>normal: normal content</li>
         * <li>spam: spam</li>
         * <li>ad: ad</li>
         * <li>politics: political content</li>
         * <li>terrorism: terrorist content</li>
         * <li>abuse: abuse</li>
         * <li>porn: pornographic content</li>
         * <li>flood: excessive junk content</li>
         * <li>contraband: prohibited content</li>
         * <li>meaningless: meaningless content</li>
         * <li>customized: custom content, such as a custom keyword</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. A greater value indicates a higher confidence level. If a value of pass is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content is normal. If a value of review or block is returned for the suggestion parameter, a higher confidence level indicates a higher probability that the content contains violations.</p>
         * <blockquote>
         * <p> This score is for reference only. We strongly recommend that you do not use this score in your business. We recommend that you use the values that are returned for the suggestion, label, and sublabel parameters to determine whether the content contains violations. The sublabel parameter is returned by some operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>99.90</p>
         */
        @NameInMap("rate")
        public Double rate;

        /**
         * <p>The moderation scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li>pass: The content passes the moderation.</li>
         * <li>review: The content needs to be manually reviewed again.</li>
         * <li>block: The content contains violations. We recommend that you delete or block the content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("suggestion")
        public String suggestion;

        public static ImAuditResponseBodyTextResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResults self = new ImAuditResponseBodyTextResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResults setDetails(java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> getDetails() {
            return this.details;
        }

        public ImAuditResponseBodyTextResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyTextResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyTextResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyTextResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ImAuditResponseBodyTextResultsResult extends TeaModel {
        /**
         * <p>The error code. The error code is the same as the HTTP status code. For more information, see <a href="https://help.aliyun.com/document_detail/29254.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The text that you specify in the moderation request.</p>
         * 
         * <strong>example:</strong>
         * <p>This is test text.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The sequence number of the text.</p>
         * 
         * <strong>example:</strong>
         * <p>cfd33235-71a4-468b-8137-a5ffe323****</p>
         */
        @NameInMap("dataId")
        public String dataId;

        /**
         * <p>The message that is returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>The returned data. If the HTTP status code 200 is returned, the array in the returned results contains one or more elements. Each element is a struct.</p>
         */
        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> results;

        /**
         * <p>The ID of the moderation task.</p>
         * 
         * <strong>example:</strong>
         * <p>txt6HB8NQoEbU@5fosnj2xVEM-1t****</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static ImAuditResponseBodyTextResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResult self = new ImAuditResponseBodyTextResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyTextResultsResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImAuditResponseBodyTextResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyTextResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyTextResultsResult setResults(java.util.List<ImAuditResponseBodyTextResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyTextResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ImAuditResponseBodyTextResults extends TeaModel {
        /**
         * <p>The text moderation results.</p>
         */
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyTextResultsResult> result;

        public static ImAuditResponseBodyTextResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResults self = new ImAuditResponseBodyTextResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResults setResult(java.util.List<ImAuditResponseBodyTextResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResult> getResult() {
            return this.result;
        }

    }

}
