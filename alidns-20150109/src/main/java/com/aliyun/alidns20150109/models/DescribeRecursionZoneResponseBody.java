// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecursionZoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2018-06-06T11:34Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1533773400000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <strong>example:</strong>
     * <p>SOAR</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>SUB</p>
     */
    @NameInMap("CreatorSubType")
    public String creatorSubType;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("CreatorType")
    public String creatorType;

    @NameInMap("EffectiveScopes")
    public DescribeRecursionZoneResponseBodyEffectiveScopes effectiveScopes;

    /**
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RecordCount")
    public Integer recordCount;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2018-01-03T08:57Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>169438909000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <strong>example:</strong>
     * <p>cheng.suow.cc</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeRecursionZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecursionZoneResponseBody self = new DescribeRecursionZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecursionZoneResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeRecursionZoneResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeRecursionZoneResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeRecursionZoneResponseBody setCreatorSubType(String creatorSubType) {
        this.creatorSubType = creatorSubType;
        return this;
    }
    public String getCreatorSubType() {
        return this.creatorSubType;
    }

    public DescribeRecursionZoneResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public DescribeRecursionZoneResponseBody setEffectiveScopes(DescribeRecursionZoneResponseBodyEffectiveScopes effectiveScopes) {
        this.effectiveScopes = effectiveScopes;
        return this;
    }
    public DescribeRecursionZoneResponseBodyEffectiveScopes getEffectiveScopes() {
        return this.effectiveScopes;
    }

    public DescribeRecursionZoneResponseBody setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public DescribeRecursionZoneResponseBody setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Integer getRecordCount() {
        return this.recordCount;
    }

    public DescribeRecursionZoneResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeRecursionZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecursionZoneResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeRecursionZoneResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeRecursionZoneResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeRecursionZoneResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeRecursionZoneResponseBody setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes extends TeaModel {
        @NameInMap("Scope")
        public java.util.List<String> scope;

        public static DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes self = new DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes();
            return TeaModel.build(map, self);
        }

        public DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes setScope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<String> getScope() {
            return this.scope;
        }

    }

    public static class DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

        /**
         * <strong>example:</strong>
         * <p>[20003]</p>
         */
        @NameInMap("Scopes")
        public DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes scopes;

        public static DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope self = new DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope();
            return TeaModel.build(map, self);
        }

        public DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope setScopes(DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes scopes) {
            this.scopes = scopes;
            return this;
        }
        public DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScopeScopes getScopes() {
            return this.scopes;
        }

    }

    public static class DescribeRecursionZoneResponseBodyEffectiveScopes extends TeaModel {
        @NameInMap("EffectiveScope")
        public java.util.List<DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope> effectiveScope;

        public static DescribeRecursionZoneResponseBodyEffectiveScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecursionZoneResponseBodyEffectiveScopes self = new DescribeRecursionZoneResponseBodyEffectiveScopes();
            return TeaModel.build(map, self);
        }

        public DescribeRecursionZoneResponseBodyEffectiveScopes setEffectiveScope(java.util.List<DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope> effectiveScope) {
            this.effectiveScope = effectiveScope;
            return this;
        }
        public java.util.List<DescribeRecursionZoneResponseBodyEffectiveScopesEffectiveScope> getEffectiveScope() {
            return this.effectiveScope;
        }

    }

}
