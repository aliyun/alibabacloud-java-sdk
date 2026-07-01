// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class InsertMediaToSearchLibRequest extends TeaModel {
    /**
     * <p>Image set information. Supports only the IPCamera scenario, and MediaType must be video.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;images&quot;: [
     *         &quot;oss://[example-bucket-]/[object_path-]xxx1.jpg&quot;,
     *         &quot;oss://[example-bucket-]/[object_path-]xxx2.jpg&quot;,
     *         &quot;oss://[example-bucket-]/[object_path-]xxx3.jpg&quot;,
     *         &quot;oss://[example-bucket-]/[object_path-]xxx4.jpg&quot;
     *     ]
     * }</p>
     */
    @NameInMap("ImagesInput")
    public String imagesInput;

    /**
     * <p>The URL of the video, audio, or image file that you want to import to the search library.</p>
     * <p>Note: Make sure that you specify a correct file name and the bucket in which the file resides is in the same region where this operation is called. Otherwise, the file cannot be found or the operation may fail.</p>
     * <p>Specify an Object Storage Service (OSS) URL in the following format: oss\://[Bucket name]/[File path]. For example, you can specify oss\://[example-bucket-<strong><strong>]/[object_path-</strong></strong>].</p>
     * <p>Specify an HTTP URL in the following format: public endpoint. For example, you can specify http\://example-test-\<em>\</em>\<em>\</em>.mp4.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://[example-bucket-]/[object_path-]</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The ID of the media asset. Each media ID is unique. If you leave this parameter empty, a media ID is automatically generated for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>411bed50018971edb60b0764a0ec6***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>video (default)</p>
     * </li>
     * <li><p>image</p>
     * </li>
     * <li><p>audio</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The message body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;test&quot;,&quot;customFields&quot;:{&quot;intField1&quot;:12,&quot;strField1&quot;:&quot;abc&quot;}}</p>
     */
    @NameInMap("MsgBody")
    public String msgBody;

    /**
     * <p>Namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the search library. Default value: ims-default-search-lib.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static InsertMediaToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertMediaToSearchLibRequest self = new InsertMediaToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public InsertMediaToSearchLibRequest setImagesInput(String imagesInput) {
        this.imagesInput = imagesInput;
        return this;
    }
    public String getImagesInput() {
        return this.imagesInput;
    }

    public InsertMediaToSearchLibRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public InsertMediaToSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public InsertMediaToSearchLibRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public InsertMediaToSearchLibRequest setMsgBody(String msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public String getMsgBody() {
        return this.msgBody;
    }

    public InsertMediaToSearchLibRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InsertMediaToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
