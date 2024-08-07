// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeEntityInfoResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEntityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntityInfoResponseBody self = new DescribeEntityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEntityInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEntityInfoResponseBody setData(DescribeEntityInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEntityInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeEntityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEntityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEntityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEntityInfoResponseBodyData extends TeaModel {
        /**
         * <p>The logical ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The information about the entry.</p>
         * 
         * <strong>example:</strong>
         * <p>{ location: &quot;xian&quot;, net_connect_dir: &quot;in&quot;, malware_type: &quot;${aliyun.siem.sas.alert_tag.login_unusual_account}&quot; }</p>
         */
        @NameInMap("EntityInfo")
        public java.util.Map<String, ?> entityInfo;

        /**
         * <p>The type of the entity. Valid values:</p>
         * <ul>
         * <li>ip</li>
         * <li>domain</li>
         * <li>url</li>
         * <li>process</li>
         * <li>file</li>
         * <li>host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The information about the risk Intelligence.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Ip&quot;: {
         *             &quot;queryHot&quot;: &quot;0&quot;,
         *             &quot;country&quot;: &quot;China&quot;,
         *             &quot;province&quot;: &quot;shanxi&quot;,
         *             &quot;ip&quot;: &quot;221.11.XX.XXX&quot;,
         *             &quot;asn&quot;: &quot;4837&quot;,
         *             &quot;asn_label&quot;: &quot;CHINAXXX-Backbone - CHINA UNICOM ChinaXXX Backbone, CN&quot;
         *       }
         * }</p>
         */
        @NameInMap("TipInfo")
        public java.util.Map<String, ?> tipInfo;

        public static DescribeEntityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEntityInfoResponseBodyData self = new DescribeEntityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEntityInfoResponseBodyData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public DescribeEntityInfoResponseBodyData setEntityInfo(java.util.Map<String, ?> entityInfo) {
            this.entityInfo = entityInfo;
            return this;
        }
        public java.util.Map<String, ?> getEntityInfo() {
            return this.entityInfo;
        }

        public DescribeEntityInfoResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeEntityInfoResponseBodyData setTipInfo(java.util.Map<String, ?> tipInfo) {
            this.tipInfo = tipInfo;
            return this;
        }
        public java.util.Map<String, ?> getTipInfo() {
            return this.tipInfo;
        }

    }

}
