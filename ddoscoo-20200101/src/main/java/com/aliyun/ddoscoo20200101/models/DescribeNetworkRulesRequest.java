// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    public Integer frontendPort;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("IsOffset")
    public Boolean isOffset;

    public static DescribeNetworkRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRulesRequest self = new DescribeNetworkRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNetworkRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkRulesRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public DescribeNetworkRulesRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public DescribeNetworkRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkRulesRequest setIsOffset(Boolean isOffset) {
        this.isOffset = isOffset;
        return this;
    }
    public Boolean getIsOffset() {
        return this.isOffset;
    }

}
