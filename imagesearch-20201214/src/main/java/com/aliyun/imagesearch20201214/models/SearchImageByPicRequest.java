// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicRequest extends TeaModel {
    /**
     * <p>The category of the product. For more information, see [Category references](~~179184~~).</p>
     * <br>
     * <p>*   For product search: If a category is specified, the specified category prevails. If no category is specified, the system estimates and selects a category. The category selected by the system is included in the response.</p>
     * <p>*   For generic search: The parameter value is set to 88888888 regardless of whether a category is specified.</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>Specifies whether to recognize the subject in the image and search for images based on the recognized subject. Valid values: true and false. Default value: true.</p>
     * <br>
     * <p>*   true: The system recognizes the subject in the image, and searches for images based on the recognized subject. The recognition result is included in the response.</p>
     * <p>*   false: The system does not recognize the subject of the image, and searches for images based on the entire image.</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    /**
     * <p>The filter conditions. int_attr supports the following operators: >, >=, <, <=, and =. str_attr supports the following operators: = and !=. You can set the logical operator between conditions to AND or OR.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   int_attr>=100</p>
     * <p>*   str_attr!="value1"</p>
     * <p>*   Example: int_attr=1000 AND str_attr="value1"</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of images to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("Num")
    public Integer num;

    /**
     * <p>The image file. The image file is encoded in Base64.</p>
     * <br>
     * <p>*   The file size of the image cannot exceed 4 MB.</p>
     * <p>*   The following image formats are supported: PNG, JPG, JPEG, BMP, GIF, WebP, TIFF, and PPM.</p>
     * <p>*   The transmission timeout period cannot exceed 5 seconds.</p>
     * <p>*   For brand image searches, the length and the width of the image must range from 200 pixels to 4,096 pixels.</p>
     * <p>*   For cloth image searches, the length and the width of the image must range from 448 pixels to 4,096 pixels.</p>
     * <p>*   For product and generic image searches, the length and the width of the image must range from 100 pixels to 4,096 pixels.</p>
     * <p>*   The image cannot contain rotation settings.</p>
     */
    @NameInMap("PicContent")
    public String picContent;

    /**
     * <p>The subject area of the image. Specify the subject area in the following format: `x1,x2,y1,y2`. `x1 and y1` represent the upper-left corner pixel. `x2 and y2` represent the lower-right corner pixel.</p>
     * <br>
     * <p>>*   If you set the Region parameter, the system searches for images based on the value of Region regardless of the value of the Crop parameter.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The number of the image to return. Valid values: 0 to 499. Default value: 0.</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static SearchImageByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicRequest self = new SearchImageByPicRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByPicRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchImageByPicRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchImageByPicRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchImageByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
