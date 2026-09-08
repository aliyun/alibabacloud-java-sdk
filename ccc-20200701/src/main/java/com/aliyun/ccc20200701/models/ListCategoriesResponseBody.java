// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data. The category node information, in the format of a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;categoryId\&quot;:\&quot;43c2671b-8939-4223-<strong><strong>-6bd187905cc8\&quot;,\&quot;childCategoryList\&quot;:[{\&quot;categoryId\&quot;:\&quot;120816ad-4392-4edf-</strong></strong>-6d053d5cfa5a\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:0,\&quot;level\&quot;:2,\&quot;name\&quot;:\&quot;客户反馈\&quot;,\&quot;parentCategoryId\&quot;:\&quot;43c2671b-8939-<strong><strong>-86d0-6bd187905cc8\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;}],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:10,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;测试一01类目\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;},{\&quot;categoryId\&quot;:\&quot;4948fcd0-2972-</strong></strong>-81c6-1a00927e1802\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:0,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;生产环境验证\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;},{\&quot;categoryId\&quot;:\&quot;c426bd7f-9661-47c3-****-2508f1a32f66\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;269801834095770945\&quot;,\&quot;editorName\&quot;:\&quot;269801834095770945\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:4,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;测试环境测试\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of incorrect parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE803553-8AA9-4B9D-9E4E-A82BC69EDCEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCategoriesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListCategoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCategoriesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
