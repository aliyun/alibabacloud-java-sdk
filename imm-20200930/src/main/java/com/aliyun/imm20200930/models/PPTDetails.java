// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PPTDetails extends TeaModel {
    /**
     * <p>The image path of the PPT frame capture.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ppts/video_snapshots_0.jpg&quot;</p>
     */
    @NameInMap("ImagePath")
    public String imagePath;

    /**
     * <p>The index of the PPT frame capture.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PPTShotIndex")
    public Long PPTShotIndex;

    /**
     * <p>The time in the video.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
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
