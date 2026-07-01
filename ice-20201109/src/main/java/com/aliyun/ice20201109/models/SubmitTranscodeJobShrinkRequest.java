// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobShrinkRequest extends TeaModel {
    /**
     * <p>The idempotence key. Ensures request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The input group for the job. A single input creates a transcoding job. Multiple inputs create a media merging job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("InputGroup")
    public String inputGroupShrink;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output group for the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("OutputGroup")
    public String outputGroupShrink;

    /**
     * <p>The job scheduling information.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>Custom settings in JSON format. The length is limited to 512 bytes. Supports <a href="https://help.aliyun.com/document_detail/451631.html">custom webhook address configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobShrinkRequest self = new SubmitTranscodeJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitTranscodeJobShrinkRequest setInputGroupShrink(String inputGroupShrink) {
        this.inputGroupShrink = inputGroupShrink;
        return this;
    }
    public String getInputGroupShrink() {
        return this.inputGroupShrink;
    }

    public SubmitTranscodeJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitTranscodeJobShrinkRequest setOutputGroupShrink(String outputGroupShrink) {
        this.outputGroupShrink = outputGroupShrink;
        return this;
    }
    public String getOutputGroupShrink() {
        return this.outputGroupShrink;
    }

    public SubmitTranscodeJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitTranscodeJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
