// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListBlueprintInstanceCreatorsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListBlueprintInstanceCreatorsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBlueprintInstanceCreatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBlueprintInstanceCreatorsResponseBody self = new ListBlueprintInstanceCreatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBlueprintInstanceCreatorsResponseBody setData(java.util.List<ListBlueprintInstanceCreatorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBlueprintInstanceCreatorsResponseBodyData> getData() {
        return this.data;
    }

    public ListBlueprintInstanceCreatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBlueprintInstanceCreatorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBlueprintInstanceCreatorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBlueprintInstanceCreatorsResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        public static ListBlueprintInstanceCreatorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBlueprintInstanceCreatorsResponseBodyData self = new ListBlueprintInstanceCreatorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBlueprintInstanceCreatorsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListBlueprintInstanceCreatorsResponseBodyData setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

    }

}
