// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeScenesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7EC26DF0-35AC-5F37-82B3-F5545D0A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of scenarios.</p>
     */
    @NameInMap("SceneList")
    public java.util.List<DescribeScenesResponseBodySceneList> sceneList;

    public static DescribeScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScenesResponseBody self = new DescribeScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScenesResponseBody setSceneList(java.util.List<DescribeScenesResponseBodySceneList> sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public java.util.List<DescribeScenesResponseBodySceneList> getSceneList() {
        return this.sceneList;
    }

    public static class DescribeScenesResponseBodySceneList extends TeaModel {
        /**
         * <p>The description of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Query access events for the primary and sub-accounts and access keys under various scenarios, such as access events occurrence, access without MFA authentication, and failed access attempts.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Account-related or AccessKey Pair-related Events</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-lpYrjKouRfy3MK-wteJW_Q</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The identifier for the scenario category.</p>
         * 
         * <strong>example:</strong>
         * <p>identity</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The type of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeScenesResponseBodySceneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScenesResponseBodySceneList self = new DescribeScenesResponseBodySceneList();
            return TeaModel.build(map, self);
        }

        public DescribeScenesResponseBodySceneList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScenesResponseBodySceneList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeScenesResponseBodySceneList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeScenesResponseBodySceneList setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeScenesResponseBodySceneList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
