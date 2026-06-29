// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsRequest extends TeaModel {
    /**
     * <p>The business scenario for record acceleration. Used as a filter condition for queries. Valid values:</p>
     * <ul>
     * <li><strong>image_video</strong>: Image and video.</li>
     * <li><strong>api</strong>: API.</li>
     * <li><strong>web</strong>: Web page.</li>
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
     * <p>The page number for paginated queries. The value must be greater than or equal to 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paginated queries. Valid values: 1 to 500. Default value: <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether proxy acceleration is enabled for the record. Used as a filter condition for queries. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Proxy enabled.</li>
     * <li><strong>false</strong>: Proxy acceleration disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The search matching mode for record names. Defaults to exact match. Valid values:</p>
     * <ul>
     * <li><strong>prefix</strong>: Prefix match.</li>
     * <li><strong>suffix</strong>: Suffix match.</li>
     * <li><strong>exact</strong>: Exact match.</li>
     * <li><strong>fuzzy</strong>: Fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("RecordMatchType")
    public String recordMatchType;

    /**
     * <p>Record name. Used as a filter condition for queries.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The origin type of the record. Used as a filter condition for queries (only CNAME records can be filtered by this field). Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS origin.</li>
     * <li><strong>S3</strong>: S3 origin.</li>
     * <li><strong>LB</strong>: Load balancer origin.</li>
     * <li><strong>OP</strong>: Origin pool.</li>
     * <li><strong>Domain</strong>: Standard domain origin.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The DNS record type of the record. Used as a filter condition for queries.</p>
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
