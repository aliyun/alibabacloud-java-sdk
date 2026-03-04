// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertSegment extends TeaModel {
    /**
     * <p>The length of the segment.</p>
     * <ul>
     * <li>Unit: seconds.</li>
     * <li>Valid values: [1,60].</li>
     * <li>Default value: 10. A value of 10 will create segments at the 10s, 20s, 30s, and 40s marks of the video.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The points in time at which the video is forcibly segmented. Separate multiple points with commas (,). You can specify up to 10 points.</p>
     * <ul>
     * <li>Format: {Point in time},{Point in time},{Point in time}.</li>
     * <li>Type: decimal. This parameter supports up to three decimal places.</li>
     * <li>Unit: seconds.</li>
     * <li>Example: 1,2,4,6,10,14,18, which specifies that the video is forcibly segmented at the 1st, 2nd, 4th, 6th, 10th, 14th, and 18th seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ForceSegTime")
    public String forceSegTime;

    public static MediaConvertSegment build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertSegment self = new MediaConvertSegment();
        return TeaModel.build(map, self);
    }

    public MediaConvertSegment setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public MediaConvertSegment setForceSegTime(String forceSegTime) {
        this.forceSegTime = forceSegTime;
        return this;
    }
    public String getForceSegTime() {
        return this.forceSegTime;
    }

}
