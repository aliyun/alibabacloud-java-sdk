// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class QueryLocationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryLocationsResponseData> data;

    public static QueryLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationsResponse self = new QueryLocationsResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryLocationsResponseData extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CnName")
        @Validation(required = true)
        public String cnName;

        @NameInMap("EnName")
        @Validation(required = true)
        public String enName;

        @NameInMap("ShowName")
        @Validation(required = true)
        public String showName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("EnDescription")
        @Validation(required = true)
        public String enDescription;

        @NameInMap("Ordering")
        @Validation(required = true)
        public Integer ordering;

        @NameInMap("DistrictId")
        @Validation(required = true)
        public String districtId;

        @NameInMap("DistrictCnName")
        @Validation(required = true)
        public String districtCnName;

        @NameInMap("DistrictEnName")
        @Validation(required = true)
        public String districtEnName;

        @NameInMap("DistrictShowName")
        @Validation(required = true)
        public String districtShowName;

        @NameInMap("DistrictOrdering")
        @Validation(required = true)
        public Integer districtOrdering;

        public static QueryLocationsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryLocationsResponseData self = new QueryLocationsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
