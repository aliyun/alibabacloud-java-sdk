// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocParsingResultResponseBody extends TeaModel {
    /**
     * <p>Returned result.</p>
     */
    @NameInMap("data")
    public GetDocParsingResultResponseBodyData data;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDocParsingResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocParsingResultResponseBody self = new GetDocParsingResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocParsingResultResponseBody setData(GetDocParsingResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocParsingResultResponseBodyData getData() {
        return this.data;
    }

    public GetDocParsingResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDocParsingResultResponseBodyData extends TeaModel {
        /**
         * <ul>
         * <li>The parsed content of the document.</li>
         * <li>The format (markdown or json) is determined by the returnFormat parameter. For specific format details, refer to: <a href="https://www.alibabacloud.com/help/en/energy-expert/developer-reference/interface-attached-information#b644b6255cojj">json return structure</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;doc_info\&quot;:{\&quot;languages\&quot;:[\&quot;zh\&quot;,\&quot;en\&quot;],\&quot;doc_type\&quot;:\&quot;pdf\&quot;,\&quot;pdf_toc\&quot;:[{\&quot;title\&quot;:\&quot;封面\&quot;,\&quot;level\&quot;:0,\&quot;page\&quot;:0}],\&quot;pages\&quot;:366,\&quot;page_list\&quot;:[{\&quot;imageWidth\&quot;:596,\&quot;imageHeight\&quot;:842,\&quot;pageIdAllDocs\&quot;:0,\&quot;fileIndex\&quot;:0,\&quot;pageIdCurDoc\&quot;:0,\&quot;angle\&quot;:0}],\&quot;doc_data\&quot;:[{\&quot;uniqueId\&quot;:\&quot;about_us_para\&quot;,\&quot;page_num\&quot;:\&quot;01\&quot;,\&quot;index\&quot;:\&quot;xxx\&quot;,\&quot;name\&quot;:\&quot;xxx\&quot;,\&quot;type\&quot;:\&quot;xxxx\&quot;,\&quot;subType\&quot;:\&quot;xxx\&quot;,\&quot;text\&quot;:\&quot;xxx\&quot;,\&quot;before_text\&quot;:\&quot;xxx\&quot;,\&quot;after_text\&quot;:\&quot;xxx\&quot;,\&quot;extInfo\&quot;:[{\&quot;uniqueId\&quot;:\&quot;b0x1x0\&quot;,\&quot;pos\&quot;:[{\&quot;x\&quot;:229,\&quot;y\&quot;:208},{\&quot;x\&quot;:421,\&quot;y\&quot;:208},{\&quot;x\&quot;:421,\&quot;y\&quot;:242},{\&quot;x\&quot;:229,\&quot;y\&quot;:242}],\&quot;text\&quot;:\&quot;Kurt Götze\&quot;,\&quot;type\&quot;:\&quot;Text\&quot;,\&quot;subType\&quot;:\&quot;Text\&quot;,\&quot;pageNum\&quot;:[0],\&quot;index\&quot;:0}]}]}}</p>
         */
        @NameInMap("content")
        public String content;

        public static GetDocParsingResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocParsingResultResponseBodyData self = new GetDocParsingResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocParsingResultResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
