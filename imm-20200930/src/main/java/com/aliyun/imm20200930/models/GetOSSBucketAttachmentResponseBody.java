// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOSSBucketAttachmentResponseBody extends TeaModel {
    /**
     * <p>The time when the dataset was created.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;2023-12-19T17:29:34.790931971+08:00&quot;</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Dataset&quot;</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the dataset was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2023-12-19T17:29:34.790931971+08:00&quot;</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetOSSBucketAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSBucketAttachmentResponseBody self = new GetOSSBucketAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSBucketAttachmentResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOSSBucketAttachmentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetOSSBucketAttachmentResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetOSSBucketAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOSSBucketAttachmentResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
