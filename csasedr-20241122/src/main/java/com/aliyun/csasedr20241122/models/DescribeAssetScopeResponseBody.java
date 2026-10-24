// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeAssetScopeResponseBody extends TeaModel {
    /**
     * <p>The endpoint asset scope details.</p>
     */
    @NameInMap("Data")
    public DescribeAssetScopeResponseBodyData data;

    /**
     * <p>The unique identifier of the request, which is used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetScopeResponseBody self = new DescribeAssetScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetScopeResponseBody setData(DescribeAssetScopeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAssetScopeResponseBodyData getData() {
        return this.data;
    }

    public DescribeAssetScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetScopeResponseBodyData extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1792800000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1792803600000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the asset scope record, which corresponds to the Id request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1932</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The effective scope mode. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: all user groups.</li>
         * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
         * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
         * <li><strong>DevTagNormal</strong>: specified device tags.</li>
         * </ul>
         * <p>The meaning of MatchTargetIds is determined by this field.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The list of effective scope targets. All elements are strings. The meaning of each element is determined by MatchMode:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Scope matching does not depend on this list.</li>
         * <li><strong>UserGroupNormal</strong>: the user group ID.</li>
         * <li><strong>DeviceGroupNormal</strong>: the device group ID.</li>
         * <li><strong>DevTagNormal</strong>: the device tag value.</li>
         * </ul>
         * <p>This list is not a list of matched endpoint UUIDs.</p>
         */
        @NameInMap("MatchTargetIds")
        public java.util.List<String> matchTargetIds;

        public static DescribeAssetScopeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetScopeResponseBodyData self = new DescribeAssetScopeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAssetScopeResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAssetScopeResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAssetScopeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAssetScopeResponseBodyData setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public DescribeAssetScopeResponseBodyData setMatchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

    }

}
