// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
    /**
     * <p>HttpCode</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the job was completed. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("CompletedTime")
    public Long completedTime;

    /**
     * <p>The time when the job was created. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <p>The status of the job. Valid values:</p>
     * <br>
     * <p>*   **created**: The job is created.</p>
     * <p>*   **expired**: The job expires.</p>
     * <p>*   **completed**: The job is completed.</p>
     * <p>*   **cancelled**: The job is canceled.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the job.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The progress of the job. Valid values: 0 to 100. Unit: percentage (%). If the job fails, the value -1 is returned.</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the job.</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time when the job was updated. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("UpdatedTime")
    public Long updatedTime;

    public static DescribeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskResponseBody self = new DescribeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTaskResponseBody setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
        return this;
    }
    public Long getCompletedTime() {
        return this.completedTime;
    }

    public DescribeTaskResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTaskResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTaskResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTaskResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

}
