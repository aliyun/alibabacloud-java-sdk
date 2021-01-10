// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageAcksRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("MessageId")
    public Long messageId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    public static ListMessageAcksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAcksRequest self = new ListMessageAcksRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageAcksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessageAcksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListMessageAcksRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListMessageAcksRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public ListMessageAcksRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

}
