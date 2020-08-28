// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceRequest extends TeaModel {
    @NameInMap("FromUnitUserId")
    @Validation(required = true)
    public Long fromUnitUserId;

    @NameInMap("FromUnitId")
    @Validation(required = true)
    public Long fromUnitId;

    @NameInMap("ResourceInstanceList")
    @Validation(required = true)
    public java.util.List<AllocateCostUnitResourceRequestResourceInstanceList> resourceInstanceList;

    @NameInMap("ToUnitUserId")
    @Validation(required = true)
    public Long toUnitUserId;

    @NameInMap("ToUnitId")
    @Validation(required = true)
    public Long toUnitId;

    public static AllocateCostUnitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceRequest self = new AllocateCostUnitResourceRequest();
        return TeaModel.build(map, self);
    }

    public static class AllocateCostUnitResourceRequestResourceInstanceList extends TeaModel {
        @NameInMap("ResourceUserId")
        @Validation(required = true)
        public Long resourceUserId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("ApportionCode")
        public String apportionCode;

        public static AllocateCostUnitResourceRequestResourceInstanceList build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostUnitResourceRequestResourceInstanceList self = new AllocateCostUnitResourceRequestResourceInstanceList();
            return TeaModel.build(map, self);
        }

    }

}
