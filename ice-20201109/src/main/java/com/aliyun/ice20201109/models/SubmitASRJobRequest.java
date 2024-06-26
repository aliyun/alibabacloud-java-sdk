// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>测试描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>00:00:10</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 或 <strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("InputFile")
    public String inputFile;

    /**
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:&quot;data&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitASRJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobRequest self = new SubmitASRJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitASRJobRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SubmitASRJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitASRJobRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitASRJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitASRJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
