// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateResourceCategoryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateResourceCategoryResponseBodyData data;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AF95C627-D725-5656-B128-B9BCCAF89025</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceCategoryResponseBody self = new CreateResourceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceCategoryResponseBody setData(CreateResourceCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateResourceCategoryResponseBodyData getData() {
        return this.data;
    }

    public CreateResourceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateResourceCategoryResponseBodyData extends TeaModel {
        /**
         * <p>Resource category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-123****7890</p>
         */
        @NameInMap("ResourceCategoryId")
        public String resourceCategoryId;

        public static CreateResourceCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceCategoryResponseBodyData self = new CreateResourceCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateResourceCategoryResponseBodyData setResourceCategoryId(String resourceCategoryId) {
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }
        public String getResourceCategoryId() {
            return this.resourceCategoryId;
        }

    }

}
