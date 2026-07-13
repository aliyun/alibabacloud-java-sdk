// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightEnableStatusRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of a request. The client generates the value of this parameter. The value must be unique for each request and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the weight algorithm. Valid values: \<em>\<em>enable\</em>\</em> and \<em>\<em>disable\</em>\</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The DNS resolution line. The default value is <strong>default</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/29807.html">DNS resolution lines</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29807.html">Resolution Line Enumeration</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">Enumeration of DNS record lines</a></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <p>The host record.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The type of the DNS record. The following types are supported: \<em>\<em>A\</em>\</em>, which maps a domain name to an IPv4 address. \<em>\<em>AAAA\</em>\</em>, which maps a domain name to an IPv6 address. \<em>\<em>CNAME\</em>\</em>, an alias record that points a domain name to another domain name. \<em>\<em>MX\</em>\</em>, a mail exchanger record that points a domain name to a mail server address. \<em>\<em>TXT\</em>\</em>, an arbitrary, human-readable text DNS record. \<em>\<em>SRV\</em>\</em>, a service record that identifies a server that provides a specific service, commonly used for directory management in Microsoft systems.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The zone ID for the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>176432424234</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionRecordWeightEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordWeightEnableStatusRequest self = new UpdateRecursionRecordWeightEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
