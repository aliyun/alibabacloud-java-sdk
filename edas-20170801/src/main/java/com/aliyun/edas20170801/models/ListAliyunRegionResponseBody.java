// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAliyunRegionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details of the regions.</p>
     */
    @NameInMap("RegionEntityList")
    public ListAliyunRegionResponseBodyRegionEntityList regionEntityList;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the region.</p>
         */
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
