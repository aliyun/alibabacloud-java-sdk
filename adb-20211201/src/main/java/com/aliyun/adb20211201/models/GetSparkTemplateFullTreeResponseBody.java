// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFullTreeResponseBody extends TeaModel {
    /**
     * <p>The directory structure of Spark applications. Fields in the response parameter:</p>
     * <ul>
     * <li><p><strong>Uid</strong>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><strong>Type</strong>: the application template type. Valid values:</p>
     * <ul>
     * <li><strong>FOLDER</strong></li>
     * <li><strong>FILE</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>Parent</strong>: indicates whether a child directory exists. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no.</li>
     * <li><strong>-1</strong>: yes.</li>
     * </ul>
     * </li>
     * <li><p><strong>Children</strong>: the child directory.</p>
     * </li>
     * <li><p><strong>LastModified</strong>: the time when applications are last modified. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * <li><p><strong>AppType</strong>: the application type. Valid values:</p>
     * <ul>
     * <li><strong>SQL</strong></li>
     * <li><strong>STREAMING</strong></li>
     * <li><strong>BATCH</strong></li>
     * </ul>
     * </li>
     * <li><p><strong>Name</strong>: the name of the directory or application.</p>
     * </li>
     * <li><p><strong>Id</strong>: the directory ID or application ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;Uid&quot;: 10415777****,     &quot;Type&quot;: &quot;FOLDER&quot;,     &quot;Parent&quot;: -1,     &quot;Children&quot;: [       {         &quot;LastModified&quot;: 1648544748,         &quot;Uid&quot;: 104157779****,         &quot;Type&quot;: &quot;FILE&quot;,         &quot;Parent&quot;: 0,         &quot;Id&quot;: s202204132****,         &quot;AppType&quot;: &quot;SQL&quot;,         &quot;Name&quot;: &quot;f&quot;       },       {         &quot;LastModified&quot;: 1648544956,         &quot;Uid&quot;: 1041577795****,         &quot;Type&quot;: &quot;FOLDER&quot;,         &quot;Parent&quot;: 0,         &quot;Id&quot;: 157,         &quot;Name&quot;: &quot;f3333&quot;       }     ],     &quot;Id&quot;: 725204,     &quot;Name&quot;: &quot;root&quot;   }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkTemplateFullTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFullTreeResponseBody self = new GetSparkTemplateFullTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFullTreeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSparkTemplateFullTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
