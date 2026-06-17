// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventListRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
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
     * <p>The end of the time range to query. This value is a UNIX timestamp representing seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1756433077</p>
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
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhangjiakou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>Specifies whether to return only events detected by AI.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OnlyAiEvt")
    public Integer onlyAiEvt;

    /**
     * <p>The sort order. Valid values: <code>asc</code> (ascending) and <code>desc</code> (descending).</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sensitivity level of the data in the event.</p>
     * 
     * <strong>example:</strong>
     * <p>S3</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>TotalBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.XXX</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start of the time range to query. This value is a UNIX timestamp representing seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1759198702</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The unique ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>aa58cdf6-6cf8-493c-912d-97619a24****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSdlEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventListRequest self = new DescribeSdlEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSdlEventListRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public DescribeSdlEventListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSdlEventListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSdlEventListRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeSdlEventListRequest setOnlyAiEvt(Integer onlyAiEvt) {
        this.onlyAiEvt = onlyAiEvt;
        return this;
    }
    public Integer getOnlyAiEvt() {
        return this.onlyAiEvt;
    }

    public DescribeSdlEventListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSdlEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSdlEventListRequest setSensitiveLevel(String sensitiveLevel) {
        this.sensitiveLevel = sensitiveLevel;
        return this;
    }
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    public DescribeSdlEventListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeSdlEventListRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeSdlEventListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSdlEventListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
