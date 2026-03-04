// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertVolume extends TeaModel {
    /**
     * <p>The output volume.</p>
     * <ul>
     * <li>This parameter takes effect only if Method is set to dynamic.</li>
     * <li>Unit: dB.</li>
     * <li>Valid values: [-70,-5].</li>
     * <li>Default value: -6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-6</p>
     */
    @NameInMap("IntegratedLoudnessTarget")
    public Integer integratedLoudnessTarget;

    /**
     * <p>The amount of gain to apply, relative to the input audio.</p>
     * <ul>
     * <li>This parameter takes effect only if Method is set to linear.</li>
     * <li>Unit: dB.</li>
     * <li>Valid values: less than or equal to 20.</li>
     * <li>Default value: -20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-20</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <p>The target loudness range.</p>
     * <ul>
     * <li>This parameter takes effect only if Method is set to dynamic.</li>
     * <li>Unit: dB.</li>
     * <li>Valid values: [1,20].</li>
     * <li>Default value: 8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("LoudnessRangeTarget")
    public Integer loudnessRangeTarget;

    /**
     * <p>The volume adjustment method. Valid values:</p>
     * <ul>
     * <li>auto</li>
     * <li>dynamic</li>
     * <li>linear</li>
     * <li>Default value: dynamic.</li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linear</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The maximum volume.</p>
     * <ul>
     * <li>This parameter takes effect only if Method is set to dynamic.</li>
     * <li>Unit: dB.</li>
     * <li>Valid values: [-9,0].</li>
     * <li>Default value: -1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("TruePeak")
    public Integer truePeak;

    public static MediaConvertVolume build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertVolume self = new MediaConvertVolume();
        return TeaModel.build(map, self);
    }

    public MediaConvertVolume setIntegratedLoudnessTarget(Integer integratedLoudnessTarget) {
        this.integratedLoudnessTarget = integratedLoudnessTarget;
        return this;
    }
    public Integer getIntegratedLoudnessTarget() {
        return this.integratedLoudnessTarget;
    }

    public MediaConvertVolume setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public MediaConvertVolume setLoudnessRangeTarget(Integer loudnessRangeTarget) {
        this.loudnessRangeTarget = loudnessRangeTarget;
        return this;
    }
    public Integer getLoudnessRangeTarget() {
        return this.loudnessRangeTarget;
    }

    public MediaConvertVolume setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MediaConvertVolume setTruePeak(Integer truePeak) {
        this.truePeak = truePeak;
        return this;
    }
    public Integer getTruePeak() {
        return this.truePeak;
    }

}
