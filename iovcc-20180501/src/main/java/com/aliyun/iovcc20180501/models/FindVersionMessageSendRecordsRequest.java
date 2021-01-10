// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessageSendRecordsRequest extends TeaModel {
    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("VersionId")
    public String versionId;

    public static FindVersionMessageSendRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessageSendRecordsRequest self = new FindVersionMessageSendRecordsRequest();
        return TeaModel.build(map, self);
    }

    public FindVersionMessageSendRecordsRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public FindVersionMessageSendRecordsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindVersionMessageSendRecordsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindVersionMessageSendRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindVersionMessageSendRecordsRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public FindVersionMessageSendRecordsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
