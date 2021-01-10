// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessagesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("TestId")
    public String testId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("SendRecordId")
    public String sendRecordId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("VersionType")
    public String versionType;

    public static FindVersionMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessagesRequest self = new FindVersionMessagesRequest();
        return TeaModel.build(map, self);
    }

    public FindVersionMessagesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindVersionMessagesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindVersionMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindVersionMessagesRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public FindVersionMessagesRequest setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

    public FindVersionMessagesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindVersionMessagesRequest setSendRecordId(String sendRecordId) {
        this.sendRecordId = sendRecordId;
        return this;
    }
    public String getSendRecordId() {
        return this.sendRecordId;
    }

    public FindVersionMessagesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public FindVersionMessagesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
