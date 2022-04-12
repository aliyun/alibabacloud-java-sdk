// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAliyunRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RegionEntityList")
    public ListAliyunRegionResponseBodyRegionEntityList regionEntityList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAliyunRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunRegionResponseBody self = new ListAliyunRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliyunRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAliyunRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAliyunRegionResponseBody setRegionEntityList(ListAliyunRegionResponseBodyRegionEntityList regionEntityList) {
        this.regionEntityList = regionEntityList;
        return this;
    }
    public ListAliyunRegionResponseBodyRegionEntityList getRegionEntityList() {
        return this.regionEntityList;
    }

    public ListAliyunRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAliyunRegionResponseBodyRegionEntityListRegionEntity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListAliyunRegionResponseBodyRegionEntityListRegionEntity build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunRegionResponseBodyRegionEntityListRegionEntity self = new ListAliyunRegionResponseBodyRegionEntityListRegionEntity();
            return TeaModel.build(map, self);
        }

        public ListAliyunRegionResponseBodyRegionEntityListRegionEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAliyunRegionResponseBodyRegionEntityListRegionEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAliyunRegionResponseBodyRegionEntityList extends TeaModel {
        @NameInMap("RegionEntity")
        public java.util.List<ListAliyunRegionResponseBodyRegionEntityListRegionEntity> regionEntity;

        public static ListAliyunRegionResponseBodyRegionEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunRegionResponseBodyRegionEntityList self = new ListAliyunRegionResponseBodyRegionEntityList();
            return TeaModel.build(map, self);
        }

        public ListAliyunRegionResponseBodyRegionEntityList setRegionEntity(java.util.List<ListAliyunRegionResponseBodyRegionEntityListRegionEntity> regionEntity) {
            this.regionEntity = regionEntity;
            return this;
        }
        public java.util.List<ListAliyunRegionResponseBodyRegionEntityListRegionEntity> getRegionEntity() {
            return this.regionEntity;
        }

    }

}
