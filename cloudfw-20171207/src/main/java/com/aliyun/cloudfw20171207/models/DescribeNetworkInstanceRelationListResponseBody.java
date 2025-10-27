// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceRelationListResponseBody extends TeaModel {
    @NameInMap("NetworkInstanceList")
    public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList> networkInstanceList;

    /**
     * <strong>example:</strong>
     * <p>284FF89D-4F70-546F-8EF6-77E0A530****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworkInstanceRelationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceRelationListResponseBody self = new DescribeNetworkInstanceRelationListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceRelationListResponseBody setNetworkInstanceList(java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList> networkInstanceList) {
        this.networkInstanceList = networkInstanceList;
        return this;
    }
    public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList> getNetworkInstanceList() {
        return this.networkInstanceList;
    }

    public DescribeNetworkInstanceRelationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInstanceRelationListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen extends TeaModel {
        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenName")
        public String cenName;

        @NameInMap("TransitRouterType")
        public String transitRouterType;

        public static DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen self = new DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen setTransitRouterType(String transitRouterType) {
            this.transitRouterType = transitRouterType;
            return this;
        }
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

    }

    public static class DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen extends TeaModel {
        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenName")
        public String cenName;

        @NameInMap("TransitRouterType")
        public String transitRouterType;

        public static DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen self = new DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen setTransitRouterType(String transitRouterType) {
            this.transitRouterType = transitRouterType;
            return this;
        }
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

    }

    public static class DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList extends TeaModel {
        @NameInMap("AssociatedCen")
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen> associatedCen;

        /**
         * <strong>example:</strong>
         * <p>vpc-dsf232d****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList self = new DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList setAssociatedCen(java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen> associatedCen) {
            this.associatedCen = associatedCen;
            return this;
        }
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceListAssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList extends TeaModel {
        @NameInMap("AssociatedCen")
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen> associatedCen;

        /**
         * <strong>example:</strong>
         * <p>cen</p>
         */
        @NameInMap("ConnectType")
        public String connectType;

        /**
         * <strong>example:</strong>
         * <p>vpc-2vcwfqbrh4kr****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        @NameInMap("PeerNetworkInstanceList")
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList> peerNetworkInstanceList;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList self = new DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setAssociatedCen(java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen> associatedCen) {
            this.associatedCen = associatedCen;
            return this;
        }
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListAssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setPeerNetworkInstanceList(java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList> peerNetworkInstanceList) {
            this.peerNetworkInstanceList = peerNetworkInstanceList;
            return this;
        }
        public java.util.List<DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceListPeerNetworkInstanceList> getPeerNetworkInstanceList() {
            return this.peerNetworkInstanceList;
        }

        public DescribeNetworkInstanceRelationListResponseBodyNetworkInstanceList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
