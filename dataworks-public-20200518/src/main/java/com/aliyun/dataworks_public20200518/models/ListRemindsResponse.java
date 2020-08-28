// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponse extends TeaModel {
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

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListRemindsResponseData data;

    public static ListRemindsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsResponse self = new ListRemindsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListRemindsResponseDataReminds extends TeaModel {
        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("DndStart")
        @Validation(required = true)
        public String dndStart;

        @NameInMap("DndEnd")
        @Validation(required = true)
        public String dndEnd;

        @NameInMap("RemindUnit")
        @Validation(required = true)
        public String remindUnit;

        @NameInMap("RemindType")
        @Validation(required = true)
        public String remindType;

        @NameInMap("AlertUnit")
        @Validation(required = true)
        public String alertUnit;

        @NameInMap("Useflag")
        @Validation(required = true)
        public Boolean useflag;

        @NameInMap("Founder")
        @Validation(required = true)
        public String founder;

        @NameInMap("NodeIds")
        @Validation(required = true)
        public java.util.List<Long> nodeIds;

        @NameInMap("BaselineIds")
        @Validation(required = true)
        public java.util.List<Long> baselineIds;

        @NameInMap("ProjectIds")
        @Validation(required = true)
        public java.util.List<Long> projectIds;

        @NameInMap("BizProcessIds")
        @Validation(required = true)
        public java.util.List<Long> bizProcessIds;

        @NameInMap("AlertMethods")
        @Validation(required = true)
        public java.util.List<String> alertMethods;

        @NameInMap("AlertTargets")
        @Validation(required = true)
        public java.util.List<String> alertTargets;

        public static ListRemindsResponseDataReminds build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseDataReminds self = new ListRemindsResponseDataReminds();
            return TeaModel.build(map, self);
        }

    }

    public static class ListRemindsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Reminds")
        @Validation(required = true)
        public java.util.List<ListRemindsResponseDataReminds> reminds;

        public static ListRemindsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseData self = new ListRemindsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
