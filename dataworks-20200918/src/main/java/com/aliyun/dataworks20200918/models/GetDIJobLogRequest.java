// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDIJobLogRequest extends TeaModel {
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("FailoverId")
    public Long failoverId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static GetDIJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogRequest self = new GetDIJobLogRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetDIJobLogRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobLogRequest setFailoverId(Long failoverId) {
        this.failoverId = failoverId;
        return this;
    }
    public Long getFailoverId() {
        return this.failoverId;
    }

    public GetDIJobLogRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDIJobLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetDIJobLogRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetDIJobLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
