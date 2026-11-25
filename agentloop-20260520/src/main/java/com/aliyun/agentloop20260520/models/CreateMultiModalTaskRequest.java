// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateMultiModalTaskRequest extends TeaModel {
    /**
     * <p>The AgentSpace name. It must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens. It must start and end with a letter or a digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The input parameters for the evaluator. The keys are defined by the evaluator specified by evaluatorRef. Example for national subsidy image inspection: {&quot;imageUrl&quot;:&quot;<a href="https://example.com/label.jpg%22%7D">https://example.com/label.jpg&quot;}</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;imageUrl&quot;:&quot;<a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/label.jpg%22%7D">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/label.jpg&quot;}</a></p>
     */
    @NameInMap("args")
    public java.util.Map<String, ?> args;

    /**
     * <p>The ARN of the role used to access OSS or SLS, such as acs:ram::<accountId>:role/<roleName>. It is used to derive the signature region.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/media-reader</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <p>The name of the evaluator registered as a public API. If the evaluator is not registered, not exposed as a public API, or the current version is invalid, a 400 error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Builtin.subsidy_api</p>
     */
    @NameInMap("evaluatorRef")
    public String evaluatorRef;

    /**
     * <p>The signature region when the media is stored in OSS or SLS, such as cn-hangzhou. This parameter is used only when the region cannot be determined from the URL itself.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ossRegion")
    public String ossRegion;

    /**
     * <p>The evaluation prompt. If omitted, it is processed as an empty string. The maximum length is 2,000 characters, counted by Unicode code points.</p>
     * 
     * <strong>example:</strong>
     * <p>Verify whether the image is complete</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>The task name, used to group multiple calls of the same business line in the console. If omitted or empty, agentloop-media-process is used. The maximum length is 128 characters. Control characters are not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>agentloop-media-process</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateMultiModalTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModalTaskRequest self = new CreateMultiModalTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiModalTaskRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public CreateMultiModalTaskRequest setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public CreateMultiModalTaskRequest setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateMultiModalTaskRequest setEvaluatorRef(String evaluatorRef) {
        this.evaluatorRef = evaluatorRef;
        return this;
    }
    public String getEvaluatorRef() {
        return this.evaluatorRef;
    }

    public CreateMultiModalTaskRequest setOssRegion(String ossRegion) {
        this.ossRegion = ossRegion;
        return this;
    }
    public String getOssRegion() {
        return this.ossRegion;
    }

    public CreateMultiModalTaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateMultiModalTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
