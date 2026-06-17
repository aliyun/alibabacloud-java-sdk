// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventSdListRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.102.XXX</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <p>The end time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1761185080</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.XXX</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aa58cdf6-6cf8-493c-912d-97619a24****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSdlEventSdListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventSdListRequest self = new DescribeSdlEventSdListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventSdListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSdlEventSdListRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public DescribeSdlEventSdListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSdlEventSdListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSdlEventSdListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSdlEventSdListRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeSdlEventSdListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSdlEventSdListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
