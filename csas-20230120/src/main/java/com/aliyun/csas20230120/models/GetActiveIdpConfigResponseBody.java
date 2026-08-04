// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetActiveIdpConfigResponseBody extends TeaModel {
    /**
     * <p>The identity provider configuration.</p>
     */
    @NameInMap("Data")
    public GetActiveIdpConfigResponseBodyData data;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetActiveIdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActiveIdpConfigResponseBody self = new GetActiveIdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActiveIdpConfigResponseBody setData(GetActiveIdpConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetActiveIdpConfigResponseBodyData getData() {
        return this.data;
    }

    public GetActiveIdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetActiveIdpConfigResponseBodyData extends TeaModel {
        /**
         * <p>A description of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>示例身份源</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-cfg001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>测试身份源</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetActiveIdpConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetActiveIdpConfigResponseBodyData self = new GetActiveIdpConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetActiveIdpConfigResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetActiveIdpConfigResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetActiveIdpConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetActiveIdpConfigResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
