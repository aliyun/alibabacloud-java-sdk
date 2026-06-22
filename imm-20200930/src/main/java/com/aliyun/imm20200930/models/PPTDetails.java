// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PPTDetails extends TeaModel {
    /**
     * <p>The URL of the captured slide image, which is stored in an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("ImagePath")
    public String imagePath;

    /**
     * <p>The zero-based index of the slide in the sequence of detected slides.</p>
     */
    @NameInMap("PPTShotIndex")
    public Long PPTShotIndex;

    /**
     * <p>The start time of the slide, in milliseconds, from the beginning of the video.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static PPTDetails build(java.util.Map<String, ?> map) throws Exception {
        PPTDetails self = new PPTDetails();
        return TeaModel.build(map, self);
    }

    public PPTDetails setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public String getImagePath() {
        return this.imagePath;
    }

    public PPTDetails setPPTShotIndex(Long PPTShotIndex) {
        this.PPTShotIndex = PPTShotIndex;
        return this;
    }
    public Long getPPTShotIndex() {
        return this.PPTShotIndex;
    }

    public PPTDetails setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
