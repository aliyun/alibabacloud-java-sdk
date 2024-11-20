// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobRequest extends TeaModel {
    /**
     * <p>The job description, which can up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>测试描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The speech duration.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:10</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The input file. You can specify an Object Storage Service (OSS) URL or the ID of a media asset in the media asset library.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 或 <strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("InputFile")
    public String inputFile;

    /**
     * <p>The start time of the speech to recognize.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job title, which can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data in the JSON format. You can specify your business information, such as the business environment and job information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;user&quot;: &quot;data&quot;,
     *       &quot;env&quot;: &quot;prod&quot;
     * }</p>
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
