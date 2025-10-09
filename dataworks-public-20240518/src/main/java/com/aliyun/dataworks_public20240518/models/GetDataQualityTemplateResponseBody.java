// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityTemplateResponseBody extends TeaModel {
    /**
     * <p>The data quality rule template.</p>
     */
    @NameInMap("DataQualityTemplate")
    public GetDataQualityTemplateResponseBodyDataQualityTemplate dataQualityTemplate;

    /**
     * <p>The API request ID, which is generated as a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityTemplateResponseBody self = new GetDataQualityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityTemplateResponseBody setDataQualityTemplate(GetDataQualityTemplateResponseBodyDataQualityTemplate dataQualityTemplate) {
        this.dataQualityTemplate = dataQualityTemplate;
        return this;
    }
    public GetDataQualityTemplateResponseBodyDataQualityTemplate getDataQualityTemplate() {
        return this.dataQualityTemplate;
    }

    public GetDataQualityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityTemplateResponseBodyDataQualityTemplate extends TeaModel {
        /**
         * <p>The time when the data quality rule template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1606724043000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>238428342865</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the data quality rule template was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1606724043000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The last updater of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>238428342865</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The owner of the data quality rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>238428342865</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>97535</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specific configurations of the data quality rule template. For more information, see <a href="~2963394~">Data quality Spec configuration description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;assertion&quot;: &quot;anomaly detection fro id_not_null_cnt&quot;,
         *     &quot;id_not_null_cnt&quot;: {
         *         &quot;query&quot;: &quot;SELECT COUNT(*) AS cnt FROM ${tableName} WHERE dt = \&quot;$[yyyymmdd-1]\&quot;;&quot;
         *     },
         *     &quot;identity&quot;: &quot;819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a&quot;
         * }</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static GetDataQualityTemplateResponseBodyDataQualityTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityTemplateResponseBodyDataQualityTemplate self = new GetDataQualityTemplateResponseBodyDataQualityTemplate();
            return TeaModel.build(map, self);
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityTemplateResponseBodyDataQualityTemplate setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
