// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmMonitorTemplatesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IP version of the detection points. An exact search is performed. Valid values:</p>
     * <ul>
     * <li><p>IPv4: This version is applicable when the target address is an IPv4 address.</p>
     * </li>
     * <li><p>IPv6: This version is applicable when the target address is an IPv6 address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The name of the health check template. A fuzzy search is performed based on the keyword that you enter.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4-Ping</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The current page number. The value starts from 1. The default value is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is <strong>100</strong>. The default value is <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The protocol used for detection. An exact search is performed. Valid values:</p>
     * <ul>
     * <li><p>ping</p>
     * </li>
     * <li><p>tcp</p>
     * </li>
     * <li><p>http</p>
     * </li>
     * <li><p>https</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ping</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static SearchCloudGtmMonitorTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmMonitorTemplatesRequest self = new SearchCloudGtmMonitorTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmMonitorTemplatesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public SearchCloudGtmMonitorTemplatesRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public SearchCloudGtmMonitorTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchCloudGtmMonitorTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmMonitorTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmMonitorTemplatesRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
