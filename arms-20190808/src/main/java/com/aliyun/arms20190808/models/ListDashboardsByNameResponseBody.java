// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameResponseBody extends TeaModel {
    /**
     * <p>Status Code. Description 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;Edas Ingress Url Analysis&quot;,&quot;type&quot;:&quot;edas-ingress-url-analysis&quot;,&quot;url&quot;:&quot;<a href="https://g.console.aliyun.com/d/1036052989950239-11040375-66-3/edas-ingress-url-analysis?var-clusterId=29ksa&var-regionId=cn-hangzhou%22%7D%5D">https://g.console.aliyun.com/d/1036052989950239-11040375-66-3/edas-ingress-url-analysis?var-clusterId=29ksa&amp;var-regionId=cn-hangzhou&quot;}]</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Returns a hint message for the result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDashboardsByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsByNameResponseBody self = new ListDashboardsByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardsByNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDashboardsByNameResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDashboardsByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardsByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
