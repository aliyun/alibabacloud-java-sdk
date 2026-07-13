// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRecursionRecordRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value on your client. The token must be unique for each request. It can contain only ASCII characters and must not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The priority of the MX record. A smaller value indicates a higher priority. Valid values: 1 to 99.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The DNS resolution line. The default value is <strong>default</strong>. For more information, see:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29807.html">DNS resolution lines</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/en/doc-detail/29807.htm">DNS resolution lines</a></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <p>The host record. The host record is the prefix of a domain name. Common examples include www, @, \* (for wildcard DNS), and mail (for mailboxes).</p>
     * <p>For example, to resolve @.example.com, set the host record to &quot;@&quot;, not an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The time to live (TTL) in seconds. This is the duration for which the record is cached. Supported values: 5, 30, 60, 3600 (1 hour), 43200 (12 hours), and 86400 (24 hours). Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. The following record types are supported: A: An IPv4 record that maps a domain name to an IPv4 address. AAAA: An IPv6 record that maps a domain name to an IPv6 address. CNAME: A canonical name record that points a domain name to another domain name. MX: A mail exchanger record that points a domain name to a mail server address. TXT: A text record that contains any human-readable text. SRV: A service record that identifies a server that provides a specific service. This is common in directory management for Microsoft systems. NS: A name server record that delegates a subdomain to another DNS provider for resolution. CAA: A Certification Authority Authorization record that restricts which certification authorities (CAs) can issue certificates for a domain. URL: A URL record that points a domain name to an existing site. SVCB: A service binding record that is used for service discovery. It provides information about supported protocols and service parameters through a DNS record. HTTPS: A record type specific to HTTPS services. An HTTPS record can define secure HTTPS connection protocols and optimal service endpoint addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The record value. Enter a value that corresponds to the specified record type.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight of the record. Valid values are integers from 1 to 100. The default value is 1. Set different weights for each address. DNS queries then return addresses based on the specified weight ratio.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>The ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AddRecursionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecursionRecordRequest self = new AddRecursionRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddRecursionRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRecursionRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddRecursionRecordRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public AddRecursionRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public AddRecursionRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public AddRecursionRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddRecursionRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public AddRecursionRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddRecursionRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public AddRecursionRecordRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
