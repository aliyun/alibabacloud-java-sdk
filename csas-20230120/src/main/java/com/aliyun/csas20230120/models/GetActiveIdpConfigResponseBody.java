// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetActiveIdpConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetActiveIdpConfigResponseBodyData data;

    /**
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
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>idp-cfg001</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
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
