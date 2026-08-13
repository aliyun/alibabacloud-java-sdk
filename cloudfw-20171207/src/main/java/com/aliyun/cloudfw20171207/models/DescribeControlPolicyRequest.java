// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy. You must specify at least one of AclUuid and Direction. If AclUuid is specified, you can query the policy by its ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number of the current page displayed in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy queries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Allow access to office network segment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy queries are supported. The value varies depending on the DestinationType (destination type).</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The traffic direction controlled by the access control policy. Valid values: in (inbound) or out (outbound). You must specify at least one of Direction and AclUuid. If AclUuid is not specified, you must specify a non-empty Direction. Otherwise, the ErrorParametersDirection error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The supported IP address version. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language type for receiving messages. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page displayed in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The enabled status of the access control policy. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type of the policy validity period for the access control policy. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy queries are supported. The value varies depending on the SourceType (source type).</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribeControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyRequest self = new DescribeControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public DescribeControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
