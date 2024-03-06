// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListApplicationAccessPointsResponseBody extends TeaModel {
    /**
     * <p>A list of AAPs.</p>
     */
    @NameInMap("ApplicationAccessPoints")
    public ListApplicationAccessPointsResponseBodyApplicationAccessPoints applicationAccessPoints;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccessPointsResponseBody self = new ListApplicationAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccessPointsResponseBody setApplicationAccessPoints(ListApplicationAccessPointsResponseBodyApplicationAccessPoints applicationAccessPoints) {
        this.applicationAccessPoints = applicationAccessPoints;
        return this;
    }
    public ListApplicationAccessPointsResponseBodyApplicationAccessPoints getApplicationAccessPoints() {
        return this.applicationAccessPoints;
    }

    public ListApplicationAccessPointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationAccessPointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint extends TeaModel {
        /**
         * <p>The authentication method.</p>
         */
        @NameInMap("AuthenticationMethod")
        public String authenticationMethod;

        /**
         * <p>The name of the AAP.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint self = new ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint();
            return TeaModel.build(map, self);
        }

        public ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint setAuthenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }
        public String getAuthenticationMethod() {
            return this.authenticationMethod;
        }

        public ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApplicationAccessPointsResponseBodyApplicationAccessPoints extends TeaModel {
        @NameInMap("ApplicationAccessPoint")
        public java.util.List<ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint> applicationAccessPoint;

        public static ListApplicationAccessPointsResponseBodyApplicationAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationAccessPointsResponseBodyApplicationAccessPoints self = new ListApplicationAccessPointsResponseBodyApplicationAccessPoints();
            return TeaModel.build(map, self);
        }

        public ListApplicationAccessPointsResponseBodyApplicationAccessPoints setApplicationAccessPoint(java.util.List<ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint> applicationAccessPoint) {
            this.applicationAccessPoint = applicationAccessPoint;
            return this;
        }
        public java.util.List<ListApplicationAccessPointsResponseBodyApplicationAccessPointsApplicationAccessPoint> getApplicationAccessPoint() {
            return this.applicationAccessPoint;
        }

    }

}
