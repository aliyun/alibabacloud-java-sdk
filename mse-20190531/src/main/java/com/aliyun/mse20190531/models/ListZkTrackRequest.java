// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZkTrackRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The end timestamp. Unit: seconds.
    @NameInMap("EndTs")
    public Long endTs;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The number of the page to return.
    @NameInMap("PageNum")
    public Long pageNum;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The path.
    @NameInMap("Path")
    public String path;

    // The request parameters.
    @NameInMap("RequestPars")
    public String requestPars;

    // Specifies whether entries are sorted in reverse chronological order.
    @NameInMap("Reverse")
    public Boolean reverse;

    // The session ID.
    @NameInMap("SessionId")
    public String sessionId;

    // The start timestamp. Unit: seconds.
    @NameInMap("StartTs")
    public Long startTs;

    public static ListZkTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZkTrackRequest self = new ListZkTrackRequest();
        return TeaModel.build(map, self);
    }

    public ListZkTrackRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListZkTrackRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public ListZkTrackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListZkTrackRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListZkTrackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListZkTrackRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListZkTrackRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListZkTrackRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListZkTrackRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListZkTrackRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
