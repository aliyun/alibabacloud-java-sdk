// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>mse-200-021</p>
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
     * <p>systemError</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    public static ListConfigTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTrackRequest self = new ListConfigTrackRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigTrackRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListConfigTrackRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListConfigTrackRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public ListConfigTrackRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListConfigTrackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigTrackRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListConfigTrackRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListConfigTrackRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListConfigTrackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConfigTrackRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListConfigTrackRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListConfigTrackRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
