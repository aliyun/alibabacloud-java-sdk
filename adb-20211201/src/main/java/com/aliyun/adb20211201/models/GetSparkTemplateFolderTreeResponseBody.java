// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFolderTreeResponseBody extends TeaModel {
    /**
     * <p>The directory structure of Spark applications, which is in the tree format. Fields in the response parameter:</p>
     * <ul>
     * <li><p><strong>Uid</strong>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><strong>Type</strong>: the application template type. Valid values: <strong>FOLDER</strong></p>
     * </li>
     * <li><p><strong>Parent</strong>: indicates whether a child directory exists. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no.</li>
     * <li><strong>-1</strong>: yes.</li>
     * </ul>
     * </li>
     * <li><p><strong>Children</strong>: the child directory.</p>
     * </li>
     * <li><p><strong>LastModified</strong>: the time when applications in the directory are last modified. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * </li>
     * <li><p><strong>Name</strong>: the name of the directory.</p>
     * </li>
     * <li><p><strong>Id</strong>: the directory ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{           &quot;Uid&quot;:195813423****,           &quot;Type&quot;:&quot;FOLDER&quot;,          &quot;Parent&quot;:-1,           &quot;Children&quot;:[              {                     &quot;LastModified&quot;:1647853173,               &quot;Uid&quot;:195813423****,                     &quot;Type&quot;:&quot;FOLDER&quot;,                     &quot;Parent&quot;:0,                     &quot;Id&quot;:157,                     &quot;Name&quot;:&quot;t&quot;         }       ],            &quot;Id&quot;:725204,            &quot;Name&quot;:&quot;root&quot;      }</p>
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

    public static GetSparkTemplateFolderTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFolderTreeResponseBody self = new GetSparkTemplateFolderTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFolderTreeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSparkTemplateFolderTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
