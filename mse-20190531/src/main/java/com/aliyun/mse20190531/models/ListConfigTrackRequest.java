// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the configuration group.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the configuration.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The start timestamp. Unit: seconds.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Specifies whether to enable reverse ordering. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The IP address of the listener.</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The end timestamp. Unit: seconds.</p>
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
