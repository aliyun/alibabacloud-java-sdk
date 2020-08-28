// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public ListBusinessResponseData data;

    public static ListBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponse self = new ListBusinessResponse();
        return TeaModel.build(map, self);
    }

    public static class ListBusinessResponseDataBusiness extends TeaModel {
        @NameInMap("BusinessId")
        @Validation(required = true)
        public Long businessId;

        @NameInMap("BusinessName")
        @Validation(required = true)
        public String businessName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static ListBusinessResponseDataBusiness build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseDataBusiness self = new ListBusinessResponseDataBusiness();
            return TeaModel.build(map, self);
        }

    }

    public static class ListBusinessResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Business")
        @Validation(required = true)
        public java.util.List<ListBusinessResponseDataBusiness> business;

        public static ListBusinessResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseData self = new ListBusinessResponseData();
            return TeaModel.build(map, self);
        }

    }

}
