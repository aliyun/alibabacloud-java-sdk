// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryBusinessLocationsResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public java.util.List<QueryBusinessLocationsResponseBodyData> data;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    @NameInMap("Success")
    public String success;

    public static QueryBusinessLocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessLocationsResponseBody self = new QueryBusinessLocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBusinessLocationsResponseBody setData(java.util.List<QueryBusinessLocationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryBusinessLocationsResponseBodyData> getData() {
        return this.data;
    }

    public QueryBusinessLocationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryBusinessLocationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBusinessLocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBusinessLocationsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryBusinessLocationsResponseBodyData extends TeaModel {
        // The Chinese name of the region.
        @NameInMap("CnName")
        public String cnName;

        // The description of the region.
        @NameInMap("Description")
        public String description;

        // The Chinese name of the district.
        @NameInMap("DistrictCnName")
        public String districtCnName;

        // The English name of the district.
        @NameInMap("DistrictEnName")
        public String districtEnName;

        // The ID of the district.
        @NameInMap("DistrictId")
        public String districtId;

        // The ordering information of the district.
        @NameInMap("DistrictOrdering")
        public Integer districtOrdering;

        // The display name of the district.
        @NameInMap("DistrictShowName")
        public String districtShowName;

        // The complete description of the region.
        @NameInMap("EnDescription")
        public String enDescription;

        // The English name of the region.
        @NameInMap("EnName")
        public String enName;

        // The ID of the region.
        @NameInMap("Name")
        public String name;

        // The ordering information.
        @NameInMap("Ordering")
        public Integer ordering;

        // The display name of the region.
        @NameInMap("ShowName")
        public String showName;

        // The type of the data.
        @NameInMap("Type")
        public String type;

        public static QueryBusinessLocationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBusinessLocationsResponseBodyData self = new QueryBusinessLocationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBusinessLocationsResponseBodyData setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public QueryBusinessLocationsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBusinessLocationsResponseBodyData setDistrictCnName(String districtCnName) {
            this.districtCnName = districtCnName;
            return this;
        }
        public String getDistrictCnName() {
            return this.districtCnName;
        }

        public QueryBusinessLocationsResponseBodyData setDistrictEnName(String districtEnName) {
            this.districtEnName = districtEnName;
            return this;
        }
        public String getDistrictEnName() {
            return this.districtEnName;
        }

        public QueryBusinessLocationsResponseBodyData setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public QueryBusinessLocationsResponseBodyData setDistrictOrdering(Integer districtOrdering) {
            this.districtOrdering = districtOrdering;
            return this;
        }
        public Integer getDistrictOrdering() {
            return this.districtOrdering;
        }

        public QueryBusinessLocationsResponseBodyData setDistrictShowName(String districtShowName) {
            this.districtShowName = districtShowName;
            return this;
        }
        public String getDistrictShowName() {
            return this.districtShowName;
        }

        public QueryBusinessLocationsResponseBodyData setEnDescription(String enDescription) {
            this.enDescription = enDescription;
            return this;
        }
        public String getEnDescription() {
            return this.enDescription;
        }

        public QueryBusinessLocationsResponseBodyData setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public QueryBusinessLocationsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBusinessLocationsResponseBodyData setOrdering(Integer ordering) {
            this.ordering = ordering;
            return this;
        }
        public Integer getOrdering() {
            return this.ordering;
        }

        public QueryBusinessLocationsResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryBusinessLocationsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
