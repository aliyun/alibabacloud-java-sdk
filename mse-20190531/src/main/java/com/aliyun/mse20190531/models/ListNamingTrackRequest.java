// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNamingTrackRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    public static ListNamingTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamingTrackRequest self = new ListNamingTrackRequest();
        return TeaModel.build(map, self);
    }

    public ListNamingTrackRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListNamingTrackRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public ListNamingTrackRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListNamingTrackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNamingTrackRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListNamingTrackRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListNamingTrackRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListNamingTrackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListNamingTrackRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListNamingTrackRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListNamingTrackRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListNamingTrackRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
