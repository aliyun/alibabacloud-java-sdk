// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListZoneTypesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("ZoneType")
    public java.util.List<ListZoneTypesResponseBodyZoneType> zoneType;

    public static ListZoneTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZoneTypesResponseBody self = new ListZoneTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZoneTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListZoneTypesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListZoneTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListZoneTypesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListZoneTypesResponseBody setZoneType(java.util.List<ListZoneTypesResponseBodyZoneType> zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public java.util.List<ListZoneTypesResponseBodyZoneType> getZoneType() {
        return this.zoneType;
    }

    public static class ListZoneTypesResponseBodyZoneTypeZoneTypeLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级掩码
        @NameInMap("Mask")
        public Long mask;

        public static ListZoneTypesResponseBodyZoneTypeZoneTypeLayer build(java.util.Map<String, ?> map) throws Exception {
            ListZoneTypesResponseBodyZoneTypeZoneTypeLayer self = new ListZoneTypesResponseBodyZoneTypeZoneTypeLayer();
            return TeaModel.build(map, self);
        }

        public ListZoneTypesResponseBodyZoneTypeZoneTypeLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListZoneTypesResponseBodyZoneTypeZoneTypeLayer setMask(Long mask) {
            this.mask = mask;
            return this;
        }
        public Long getMask() {
            return this.mask;
        }

    }

    public static class ListZoneTypesResponseBodyZoneType extends TeaModel {
        // 园区类型名称
        @NameInMap("Name")
        public String name;

        // 资源名称
        @NameInMap("ZoneTypeName")
        public String zoneTypeName;

        // 园区层级
        @NameInMap("ZoneTypeLayer")
        public java.util.List<ListZoneTypesResponseBodyZoneTypeZoneTypeLayer> zoneTypeLayer;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 资源一级ID
        @NameInMap("ZoneTypeId")
        public String zoneTypeId;

        public static ListZoneTypesResponseBodyZoneType build(java.util.Map<String, ?> map) throws Exception {
            ListZoneTypesResponseBodyZoneType self = new ListZoneTypesResponseBodyZoneType();
            return TeaModel.build(map, self);
        }

        public ListZoneTypesResponseBodyZoneType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListZoneTypesResponseBodyZoneType setZoneTypeName(String zoneTypeName) {
            this.zoneTypeName = zoneTypeName;
            return this;
        }
        public String getZoneTypeName() {
            return this.zoneTypeName;
        }

        public ListZoneTypesResponseBodyZoneType setZoneTypeLayer(java.util.List<ListZoneTypesResponseBodyZoneTypeZoneTypeLayer> zoneTypeLayer) {
            this.zoneTypeLayer = zoneTypeLayer;
            return this;
        }
        public java.util.List<ListZoneTypesResponseBodyZoneTypeZoneTypeLayer> getZoneTypeLayer() {
            return this.zoneTypeLayer;
        }

        public ListZoneTypesResponseBodyZoneType setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListZoneTypesResponseBodyZoneType setZoneTypeId(String zoneTypeId) {
            this.zoneTypeId = zoneTypeId;
            return this;
        }
        public String getZoneTypeId() {
            return this.zoneTypeId;
        }

    }

}
