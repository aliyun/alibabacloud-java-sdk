// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsRequest extends TeaModel {
    /**
     * <p>The business scenario for acceleration. Use this parameter to filter results. Valid values:</p>
     * <ul>
     * <li><p><strong>image_video</strong>: Images and videos.</p>
     * </li>
     * <li><p><strong>api</strong>: API.</p>
     * </li>
     * <li><p><strong>web</strong>: Web page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    @NameInMap("CustomPort")
    public String customPort;

    /**
     * <p>The page number. Defaults to <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Defaults to <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results based on whether the record is proxied. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The record is proxied.</p>
     * </li>
     * <li><p><strong>false</strong>: The record is not proxied.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The match type for the record name search. Defaults to <strong>exact</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>prefix</strong>: Prefix match.</p>
     * </li>
     * <li><p><strong>suffix</strong>: Suffix match.</p>
     * </li>
     * <li><p><strong>exact</strong>: Exact match.</p>
     * </li>
     * <li><p><strong>fuzzy</strong>: Fuzzy match.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("RecordMatchType")
    public String recordMatchType;

    /**
     * <p>The record name. Use this parameter to filter query results.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Filters the results by the record\&quot;s origin type. This filter applies only to CNAME records. Valid values:</p>
     * <ul>
     * <li><p><strong>OSS</strong>: OSS origin.</p>
     * </li>
     * <li><p><strong>S3</strong>: S3 origin.</p>
     * </li>
     * <li><p><strong>LB</strong>: Load balancer origin.</p>
     * </li>
     * <li><p><strong>OP</strong>: Origin pool.</p>
     * </li>
     * <li><p><strong>Domain</strong>: Domain origin.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The DNS record type. Use this parameter to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>CNAME</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecordsRequest self = new ListRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecordsRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ListRecordsRequest setCustomPort(String customPort) {
        this.customPort = customPort;
        return this;
    }
    public String getCustomPort() {
        return this.customPort;
    }

    public ListRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecordsRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public ListRecordsRequest setRecordMatchType(String recordMatchType) {
        this.recordMatchType = recordMatchType;
        return this;
    }
    public String getRecordMatchType() {
        return this.recordMatchType;
    }

    public ListRecordsRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public ListRecordsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListRecordsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
