// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListApplicationsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>vxc2341gfssad12</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>FC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setData(java.util.List<ListApplicationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyData> getData() {
        return this.data;
    }

    public ListApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1332695887xxxxxx</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>应用描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00.000+00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        @NameInMap("name")
        public String name;

        public static ListApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyData self = new ListApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyData setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListApplicationsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApplicationsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
