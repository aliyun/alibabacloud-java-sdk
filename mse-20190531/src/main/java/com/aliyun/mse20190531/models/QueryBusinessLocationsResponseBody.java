// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryBusinessLocationsResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryBusinessLocationsResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3369AD10-F1A6-4E6F-B99E-20F51826****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The Chinese name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Shanghai)</p>
         */
        @NameInMap("CnName")
        public String cnName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Shanghai)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Chinese name of the district.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia Pacific</p>
         */
        @NameInMap("DistrictCnName")
        public String districtCnName;

        /**
         * <p>The English name of the district.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia Pacific</p>
         */
        @NameInMap("DistrictEnName")
        public String districtEnName;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>asia-pacific</p>
         */
        @NameInMap("DistrictId")
        public String districtId;

        /**
         * <p>The ordering information of the district.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("DistrictOrdering")
        public Integer districtOrdering;

        /**
         * <p>The display name of the district.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia Pacific</p>
         */
        @NameInMap("DistrictShowName")
        public String districtShowName;

        /**
         * <p>The complete description of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China East 2 (Shanghai)</p>
         */
        @NameInMap("EnDescription")
        public String enDescription;

        /**
         * <p>The English name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Shanghai)</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ordering information.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Ordering")
        public Integer ordering;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Shanghai)</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
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
